package org.ncu.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleUI implements CommandLineRunner {

    private final InventoryService inventoryService;

    @Autowired
    public ConsoleUI(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Inventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. View Inventory");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) 
            {
                case 1:
                    addProduct(scanner);
                    break;
                case 2:
                    updateProduct(scanner);
                    break;
           
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    private void addProduct(Scanner scanner) {
        System.out.println("Enter product details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Price: ");
        double price = scanner.nextDouble();

        Product product = new Product();
        product.setName(name);
        product.setQuantity(quantity);
        product.setPrice(price);

        inventoryService.addProduct(product);
        System.out.println("Product added successfully!");
    }

    private void updateProduct(Scanner scanner) {
        System.out.print("Enter product ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Product existingProduct = inventoryService.getProductById(id);
        if (existingProduct != null) {
            System.out.println("Enter updated product details:");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
            System.out.print("Price: ");
            double price = scanner.nextDouble();

            Product updatedProduct = new Product();
            updatedProduct.setName(name);
            updatedProduct.setQuantity(quantity);
            updatedProduct.setPrice(price);

            inventoryService.updateProduct(id, updatedProduct);
            System.out.println("Product updated successfully!");
        } else {
            System.out.println("Product not found!");
        }
    }

}