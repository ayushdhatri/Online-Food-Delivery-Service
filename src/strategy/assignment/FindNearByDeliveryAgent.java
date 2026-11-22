package strategy.assignment;

import models.Address;
import models.DeliveryAgent;
import models.Order;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindNearByDeliveryAgent implements FindDeliveryAgentStrategy {

    @Override
    public Optional<DeliveryAgent> findDeliveryAgent(List<DeliveryAgent> agents, Order order) {
        DeliveryAgent agent;
        // here we need to find nearby location
        Address restaurantLocation = order.getRestaurant().getAddress();
        Address customerLocation = order.getCustomer().getAddress();

        Comparator<Double> locationComp = new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return o1.compareTo(o2);
            }
        };

        return Optional.ofNullable(agents.stream().filter(DeliveryAgent::isAvailable)
                .sorted(Comparator.comparingDouble(ag -> calculateDistance(ag.getCurrentLocation(), restaurantLocation, customerLocation)))
                .findFirst().orElse(null));


    }

    private double calculateDistance(Address agentLocation, Address restaurantLocation, Address customerLocation){
        double agentToRestaurant = agentLocation.distanceTo(restaurantLocation);
        double restaurantToCustomer = restaurantLocation.distanceTo(customerLocation);
        return agentToRestaurant + restaurantToCustomer;

    }
}
