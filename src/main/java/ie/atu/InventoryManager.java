package ie.atu;

import java.util.Scanner;
import java.util.ArrayList;

public class InventoryManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("How many products are you entering into the Inventory?: ");
        int totalEntries = Integer.parseInt(sc.nextLine());

        for(ArrayList<InventoryMethods> products = new ArrayList<>(); i < totalEntries; i++)
        {
            sc.nextLine();
            System.out.println("Enter the name of the product you want to store: ");
            String product = sc.nextLine();
            System.out.println("Enter the quantity of the product you want to store: ");
            int quantity = sc.nextInt();

            InventoryMethods product1 = new InventoryMethods();
            products.add(product1);
            product1.setProduct(product);
            product1.setQuantity(quantity);
        }
    }


}
