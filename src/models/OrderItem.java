package models;

public class OrderItem {
    private MenuItem item;

    private final int quantity;

    public OrderItem(MenuItem item, int quantity){
        this.item = item;
        this.quantity = quantity;
    }


    public MenuItem getItemName(){
        return this.item;
    }

    public int getQuantity() { return this.quantity;}

    public double getSubTotal(){
        return 1.00 * this.quantity * item.getPrice();
    }




}
