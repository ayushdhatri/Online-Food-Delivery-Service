package strategy.assignment;

import models.DeliveryAgent;
import models.Order;

import java.util.List;
import java.util.Optional;

public interface FindDeliveryAgentStrategy {
    Optional<DeliveryAgent> findDeliveryAgent(List<DeliveryAgent> agents, Order order);
}
