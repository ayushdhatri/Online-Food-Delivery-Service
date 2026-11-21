package models;

import utils.IdGenerator;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    private Address address;

    private final List<Order> orderHistory;

    public Customer(String name, String phone, Address address){
        super(name, phone);
        this.orderHistory = new ArrayList<>();
        this.address = address;
    }

    public Address getAddress(){
        return this.address;
    }

    public void addOrderToHistory(Order order){
        this.orderHistory.add(order);
    }

}
