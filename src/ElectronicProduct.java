public class ElectronicProduct extends Product {
    private String brand;
    public ElectronicProduct(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public String getName() {
        return name;
    }
    @Override  // overrides

    public String toString() {
        return String.format("Name: %s, Price: Rs. %.2f, Brand: %s", name, price, brand);
    }
}