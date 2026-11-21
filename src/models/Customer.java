package models;

import utils.IdGenerator;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String id;

    private final String name;

    private Address address;

    private List<Order> orderHistory;

    public Customer(String name, Address address){
        this.id = IdGenerator.generateId();
        this.name = name;
        this.address = address;
        this.orderHistory = new ArrayList<>();
    }

    public String getId(){ return this.id; }

    public String getName() { return this.name; }

    public Address getAddress() { return this.address; }

    public List<Order> getOrderHistory() { return this.orderHistory; }

    public void addOrder(Order order){
        this.orderHistory.add(order);
    }

}
