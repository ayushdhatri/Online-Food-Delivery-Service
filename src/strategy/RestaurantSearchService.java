package strategy;

import dtos.SearchCriteria;
import models.Restaurant;

import java.util.List;

public interface RestaurantSearchService {
    List<Restaurant> filterRestaurant(List<Restaurant> restaurants, SearchCriteria criteria);
}
