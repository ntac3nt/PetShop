package petshop.models;

import java.io.Serializable;

public class Dog extends Pet implements Vacxin, Serializable {

    private String name;
    private String descrip;
    private boolean vacxin;
    private int isStock;

    public Dog(String name, String descrip, int isStock, boolean vacxin,
               String id, double price, int age, double weight, String color) {
        super(id, price, age, weight, color);
        this.name = name;
        this.descrip = descrip;
        this.isStock = isStock;
        this.vacxin = vacxin;
    }

    @Override
    public boolean isVacxinated() {
        return vacxin;
    }
    public void setVacxinated(boolean t) {
        this.vacxin = t;
    }
    public void setInStock(int stock) {
        this.isStock = stock;
    }
    @Override
    public int isInStock() {
        return isStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    @Override
    public double caculatorCalor() {
        return Math.pow((weight / 1000), 0.75) * 70;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
                "\nName: %s\nVaccinated: %s\nIn Stock: %d\nDescription: %s\n",
                name,
                vacxin ? "Yes" : "No",
                isStock,
                descrip
        );
    }
}
