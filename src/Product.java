import java.io.Serializable;

abstract class Product implements Serializable {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract String getName();
    public double getPrice() {
        return price;
    }
}
