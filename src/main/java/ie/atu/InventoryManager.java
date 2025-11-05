package ie.atu;

import java.util.Scanner;

public class InventoryManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("Enter the name of the product you want to store: ");
        String product = sc.nextLine();
        System.out.println("Enter the quantity of the product you want to store: ");
        int quantity = sc.nextInt();
    }
}
