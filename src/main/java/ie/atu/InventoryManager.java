package ie.atu;

import java.util.Scanner;
import java.util.ArrayList;

public class InventoryManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("How many products are you entering into the Inventory?: ");
        int totalEntries = Integer.parseInt(sc.nextLine());
        ArrayList<InventoryMethods> products = new ArrayList<>();
        InventoryMethods product1 = new InventoryMethods();

        for(i = 0; i < totalEntries; i++)
        {
            sc.nextLine();
            System.out.println("Enter the name of the product you want to store: ");
            String product = sc.nextLine();
            System.out.println("Enter the quantity of the product you want to store: ");
            int quantity = sc.nextInt();

            products.add(product1);
            product1.setProduct(product);
            product1.setQuantity(quantity);
        }
        System.out.println("Are you satisfied with the Entries?\n Yes or No: ");
        String answer = sc.nextLine();
        int result = switch(answer){
            case "Yes", "yes", "y", "Y"  -> {
                System.out.println("Thank you for using our Inventory Manager");
                yield 0;
            }
            case "No", "no", "n", "N"  -> {
                System.out.println("Enter the index of the product you want to update: ");
                int index = Integer.parseInt(sc.nextLine());
                index = index - 1;
                product1.remove(index);
                yield index;
            }
            default -> { System.out.println("Wrong input.");
                yield 0;
            }
        };
         /* System.out.println("Enter the name of the product you want to store: ");
        String product = sc.nextLine();
        System.out.println("Enter the quantity of the product you want to store: ");
        int quantity = sc.nextInt();
        products.indexOf(result) */

    }


}
