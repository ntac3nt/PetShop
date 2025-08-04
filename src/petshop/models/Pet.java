package petshop.models;

import java.io.Serializable;

public abstract class Pet implements Serializable {

    protected String id;
    protected double price;
    protected int age;
    protected double weight;
    protected String color;

    public Pet(String id, double price, int age, double weight, String color) {
        this.id = id;
        this.color = color;
        this.price = price;
        this.age = age;
        this.weight = weight;
    }

    public abstract double caculatorCalor();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format(
                "ID: %s\nPrice: %.1f\nAge: %d\nWeight: %s\nColor: %s",
                id,
                price,
                age,
                weight,
                color
        );
    }
}
