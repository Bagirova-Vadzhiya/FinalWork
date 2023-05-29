package com.example.finalwork;

public class Entity {

    // поля
    private String name;
    private String description;
    private int resource;

    // конструктор
    public Entity(String name, String description, int resource) {
        this.name = name;
        this.description = description;
        this.resource = resource;
    }

    // геттеры и  сеттеры

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }
}
