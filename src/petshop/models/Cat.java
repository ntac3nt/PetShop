package petshop.models;

import java.io.Serializable;

public class Cat extends Pet implements Vacxin, Serializable {

    private String name;
    private String descrip;
    private boolean vacxin;
    private int isStock;

    public Cat(String name, String descrip, int isStock, boolean vacxin, String id,
            double price, int age, double weight, String color) {
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
    @Override
    public int isInStock() {
        return isStock;
    }
    public void setInStock(int stock) {
        this.isStock = stock;
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
        return (weight / 1000) * 30 + 70;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\name :  %s\nvacxin: %s\nIstock : %d\nDescription : %s\n",
                name,
                vacxin ? "Yes" : "No",
                isStock,
                descrip
        );
    }
}
