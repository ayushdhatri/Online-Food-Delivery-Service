package models;

import utils.IdGenerator;

public abstract class User {
    private final String id;

    private final String name;

    private final String phone;

    public User(String name, String phone){
        this.id = IdGenerator.generateId();
        this.name = name;
        this.phone = phone;
    }

    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }




}
