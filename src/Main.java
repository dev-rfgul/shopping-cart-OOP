import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String username;
        int passwd;

        boolean auth = false;
        Scanner input = new Scanner(System.in);

        Login login = new Login();

        while (!auth) {

            try{
                System.out.print("Enter username: ");
                username = input.next();
                System.out.print("Enter pass: ");
                passwd = input.nextInt();
                auth = login.verify(username, passwd);
                }
            catch (Exception e){
                System.out.println("Password must be a pin code.");
            }
        }

        ShoppingCart shoppingCart = new ShoppingCart();

        Scanner scanner = new Scanner(System.in);
        int choice;
        try{
            do {
            System.out.println("// --------------------------------- //");
            System.out.println("1. Add Grocery Product.");
            System.out.println("2. Add Electronic Product.");
            System.out.println("3. Display Cart Items.");
            System.out.println("4. Display Bill/Total Price.");
            System.out.println("5. Save Cart Items.");
            System.out.println("6. Import Cart Items.");
            System.out.println("7. Exit.");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    System.out.print("Enter Grocery Product Name: ");
                    String groceryName = scanner.next();
                    System.out.print("Enter Grocery Product Price: Rs. ");
                    double groceryPrice = scanner.nextDouble();
                    System.out.print("Enter Grocery Product Weight (in kg): ");
                    double groceryWeight = scanner.nextDouble();
                    GroceryProduct groceryProduct = new GroceryProduct(groceryName, groceryPrice, groceryWeight);
                    shoppingCart.addItem(groceryProduct);
                    break;

                case 2:
                    System.out.print("Enter Electronic Product Name: ");
                    String electronicName = scanner.next();
                    System.out.print("Enter Electronic Product Price: ");
                    int electronicPrice = scanner.nextInt();
                    System.out.print("Enter Electronic Product Brand: ");
                    String electronicBrand = scanner.next();
                    ElectronicProduct electronicProduct = new ElectronicProduct(electronicName, electronicPrice, electronicBrand);
                    shoppingCart.addItem(electronicProduct);
                    break;

                case 3:
                    shoppingCart.displayItems();
                    break;

                case 4:
                    System.out.println("\n\n\nTotal Price is: Rs. " + shoppingCart.getTotalPrice() + "\n\n\n");
                    break;

                case 5:
                    shoppingCart.Export();
                    break;

                case 6:
                    shoppingCart.Import();
                    break;

                case 7:
                    return;

                default:
                    System.out.println("Invalid option.");
            }

        } while (true);
        } catch (Exception e){
            System.out.println("Invalid option Catch.");
        }
}
}
