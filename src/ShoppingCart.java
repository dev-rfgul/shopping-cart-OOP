import java.io.*;

public class ShoppingCart implements Serializable {
    public Product[] products;
    public int itemCount;
    public void Export(){
        try {
            FileOutputStream fileStream = new FileOutputStream("Cart.ser");
            ObjectOutputStream objStream = new ObjectOutputStream(fileStream);

            objStream.writeObject(products);

            objStream.close();
            fileStream.close();

            System.out.println("Cart items saved to file.");
        }
        catch (IOException e){
            System.out.println("Error exporting.");
        }
    }
    public void Import(){

        Product[] products = null;

        try{
            FileInputStream fileIn = new FileInputStream("Cart.ser");
            ObjectInputStream ObjIn = new ObjectInputStream(fileIn);

            products = (Product[]) ObjIn.readObject();

            ObjIn.close();
            fileIn.close();
            System.out.println("Cart items Imported.");
        }
        catch (IOException | ClassNotFoundException e){
            System.out.println("Error importing.");
        }

    }
    public Product[] getProducts() {
        return products;
    }

    public ShoppingCart() {
        products = new Product[10];
        itemCount = 0;
    }
    public void addItem(Product item) {
        if (itemCount < products.length) {
            products[itemCount++] = item; // product[0] = itemName  // increases itemCount by 1.
            System.out.println("\n\n\n  => Item added to the shopping cart.\n\n\n");
            System.out.println("// --------------------------------- //");
        } else {
            System.out.println("\n\n\nShopping cart is full. Cannot add more items.\n\n\n");
        }
    }
    public void displayItems() {
        System.out.println("Shopping Cart Items:\n\n");
        if (itemCount == 0) {
            System.out.println("\n\n\nNo items in the shopping cart.\n\n\n");
        }
        else {
            for (int i = 0; i < itemCount; i++) {
                System.out.println(products[i].toString());
            }
        }
    }
    public double getTotalPrice() {
        double total = 0.0;
        for (int i = 0; i < itemCount; i++) {
            total += products[i].getPrice();
        }
        return total;
    }
}