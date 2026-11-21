package models;

public class DeliveryAgent extends User{
    private boolean isAvailable;

    private Address currentAddress;

    public DeliveryAgent(String name, String phone) {
        super(name, phone);
        this.isAvailable = true;
    }

    public Address getCurrentLocation(){
        return this.currentAddress;
    }

    public void setCurrentLocation(Address address){
        this.currentAddress = address;
    }

    public boolean isAvailable(){
        return this.isAvailable;
    }

    public void setAvailable(boolean available){
         this.isAvailable = available;
    }

}

