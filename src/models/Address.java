package models;

public class Address {
    private final String city;

    private final String state;

    private final String pinCode;

    private final String latitude;

    private final String longitude;


    public Address(String city, String state, String pinCode, String latitude, String longitude){
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getCity(){ return this.city;}

    public String getState() { return this.state; }

    public String getPinCode(){ return this.pinCode; }

    public String getLatitude() { return this.latitude;}

    public String getLongitude() { return this.longitude;}

}
