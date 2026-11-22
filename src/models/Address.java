package models;

public class Address {
    private final String city;

    private final String state;

    private final String pinCode;

    private double latitude;

    private double longitude;


    public Address(String city, String state, String pinCode, double latitude, double longitude){
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getCity(){ return this.city;}

    public String getState() { return this.state; }

    public String getPinCode(){ return this.pinCode; }

    public double getLatitude() { return this.latitude;}

    public double getLongitude() { return this.longitude;}

    public double distanceTo(Address other){
        Address address = this;
        double latitudeDiff = address.getLatitude() - other.getLatitude();
        double longitudeDiff = address.getLongitude() - other.getLongitude();
        return Math.sqrt((latitudeDiff * latitudeDiff) + longitudeDiff * longitudeDiff);
    }

}
