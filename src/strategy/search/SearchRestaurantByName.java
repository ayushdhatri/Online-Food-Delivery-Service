package strategy.search;

import dtos.SearchCriteria;
import models.Restaurant;

import java.util.List;

public class SearchRestaurantByName implements RestaurantSearchService {

    @Override
    public List<Restaurant> filterRestaurant(List<Restaurant> restaurants, SearchCriteria criteria) {
        return restaurants.stream().filter(restaurant -> {
            if(restaurant.getName().equalsIgnoreCase(criteria.getRestaurantName())) return true;
            return false;
        }).toList();
    }
}
