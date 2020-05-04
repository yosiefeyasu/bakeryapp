import java.lang.reflect.Array;
import java.util.ArrayList;

public class BakedGoods {

    private String name;
    private double price;
    private String expDate = "May 4, 2020";
    private int qtyInStock;
    private ArrayList<String> dietRest = new ArrayList<>();

    public BakedGoods(String name, double price, int qtyInStock) {
        this.name = name;
        this.price = price;
        this.qtyInStock = qtyInStock;

    }

    public BakedGoods(String name){
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getExpDate() {
        return expDate;
    }

    public ArrayList<String> getDietRest() {
        return dietRest;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public void setDietRest(String dietRest) {
        this.dietRest.add(dietRest);
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
}
