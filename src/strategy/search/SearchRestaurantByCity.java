package strategy.search;

import dtos.SearchCriteria;
import models.Restaurant;

import java.util.List;

public class SearchRestaurantByCity implements RestaurantSearchService {
    @Override
    public List<Restaurant> filterRestaurant(List<Restaurant> restaurants, SearchCriteria criteria) {
        return restaurants.stream().filter(restaurant -> {
            return restaurant.getAddress().getCity().equalsIgnoreCase(criteria.getCity());
        }).toList();

    }
}
