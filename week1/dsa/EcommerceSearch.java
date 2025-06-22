package week1.dsa;

import java.util.Scanner;

public class EcommerceSearch {
     public static boolean searchProduct(String[] products, String target) {
        for (String product : products) {
            if (product.equalsIgnoreCase(target)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] products = {"laptop", "phone", "charger", "mouse", "keyboard"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product to search: ");
        String target = sc.nextLine();

        if (searchProduct(products, target)) {
            System.out.println("Product found!");
        } else {
            System.out.println("Product not found.");
        }
    }
}
