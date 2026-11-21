package dtos;

public class SearchCriteria {
    private  String city;

    private String restaurantName;

    private String latitude;

    private String longitude;

    public String getCity() {
        return city;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public SearchCriteria(){
        this.city = null;
        this.restaurantName = null;
        this.latitude = null;
        this.longitude = null;
    }

    public void setCity(String city){
        this.city =city;
    }

    public void setRestaurantName(String restaurantName){
        this.restaurantName = restaurantName;
    }

    public void setLatitude(String latitude){this.latitude = latitude;}

    public void setLongitude(String longitude) {this.longitude = longitude;}




}
