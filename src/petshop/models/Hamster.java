
package petshop.models;

import java.io.Serializable;

public class Hamster extends Pet implements Vacxin, Serializable {
    private String descrip;
    private boolean vacxin;
    private int isStock;

    public Hamster(String desc, boolean vacxin, int isStock, String id, double price, int age, double weight, String color) {
        super(id, price, age, weight, color);
        this.vacxin = vacxin;
        this.isStock = isStock;
        this.descrip = desc;
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
    
    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
    @Override
    public double caculatorCalor() {
        return Math.pow((weight / 1000), 3/4) *70*3/2;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nvacxin: %s\nIstock : %d\nDescription : %s\n",
                vacxin ? "Yes" : "No",
                isStock,
                descrip
        );
    }
}
