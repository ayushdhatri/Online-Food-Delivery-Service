package models;

import utils.IdGenerator;

import java.awt.*;

public class Restaurant {
    private final String id;

    private String name;

    private Address address;

    private Menu menu;

    public Restaurant(String name, Address address){
        this.id = IdGenerator.generateId();
        this.name = name;
        this.address = address;
        this.menu = new Menu();
    }

    public String getId() { return this.id;}

    public String getName() { return this.name; }

    public Address getAddress() { return this.address;}

    public Menu getMenu() { return this.menu;}




}
