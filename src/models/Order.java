package models;

import enums.OrderStatus;
import utils.IdGenerator;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


public class Order {
    private final String id;

    private final Restaurant restaurant;

    private final Customer customer;

    private final List<OrderItem> items;

    private OrderStatus status;

    private DeliveryAgent agent;

    private LocalDateTime orderedAt;

    private LocalDateTime deliveredAt;

    public Order(Restaurant restaurant, Customer customer, List<OrderItem> orderItems){
        this.id = IdGenerator.generateId();
        this.restaurant = restaurant;
        this.customer =customer;
        this.items = orderItems;
        this.status = OrderStatus.PLACED;
        this.orderedAt = LocalDateTime.now();
    }

    public String getId() { return this.id;}
    public Restaurant getRestaurant() { return this.restaurant;}
    public Customer getCustomer() { return this.customer;}
    public OrderStatus getStatus() { return this.status;}
    public DeliveryAgent getDeliveryAgent(){ return this.agent;}

    public void assignDeliveryAgent(DeliveryAgent agent){
        this.agent = agent;
        agent.setAvailable(false);
    }

    public void setStatus(OrderStatus newStatus){
        if(this.status != newStatus){
            this.status = newStatus;
            if(newStatus == OrderStatus.DELIVERED && this.agent != null){
                this.agent.setAvailable(true);
            }
        }
    }

    public boolean cancel(){
        if(this.status == OrderStatus.PLACED || this.status == OrderStatus.ACCEPTED){
            this.status = OrderStatus.CANCELLED;
            if(agent != null){
                this.agent.setAvailable(true);
            }
            return true;
        }
        return false;
    }

    public double getTotal(){
        return this.items.stream().mapToDouble((OrderItem::getSubTotal)).sum();
    }



}
