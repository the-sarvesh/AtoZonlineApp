import java.util.*;
import java.util.Map.Entry;

public class AtoZOnlineApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize modules
        RegistrationModule registrationModule = new RegistrationModule();
        ProductModule productModule = new ProductModule();
        BillingModule billing = new BillingModule();

        System.out.println("Welcome to AtoZ Online App!");

        // Step 1: Registration
        System.out.println("Please register to continue.");
        String address = registrationModule.register(sc);

        while (true) {
            // Step 2: Display categories
            System.out.println("\nAvailable product categories:");
            productModule.showCategories();
            String selectedCategory = selectCategory(sc, productModule);

            // Step 3: Display products in the selected category
            System.out.println("\nAvailable products in category: " + selectedCategory);
            productModule.showProductsInCategory(selectedCategory);

            System.out.println("How many products do you want to add to your cart?");
            int productCount = getIntInput(sc, "Enter a valid number of products:");

            for (int i = 0; i < productCount; i++) {
                System.out.println("Enter product number to add to cart:");
                int productNumber = getIntInput(sc, "Enter a valid product number:");
                Entry<String, Double> product = productModule.getProduct(selectedCategory, productNumber);

                if (product != null) {
                    billing.addToCart(product.getKey(), product.getValue());
                } else {
                    System.out.println("Invalid product number! Please choose a valid product.");
                    i--; // Retry the current iteration
                }
            }

            // Step 4: Show bill
            System.out.println("\nYour current cart:");
            billing.showCart();

            // Checkout or shop more
            if (getYesOrNoInput(sc, "Do you want to checkout? (yes/no):").equals("yes")) {
                billing.processPayment(sc, address);
                System.out.println("Thank you for shopping with AtoZ Online App!");
                break;
            } else if (!getYesOrNoInput(sc, "Do you want to shop more? (yes/no):").equals("yes")) {
                System.out.println("Thank you for visiting AtoZ Online App!");
                break;
            }
        }

        sc.close();
    }

    // Method to select a category
    private static String selectCategory(Scanner sc, ProductModule productModule) {
        int categoryNumber = getIntInput(sc, "Enter the number corresponding to the category:");
        int count = 1;

        for (String category : productModule.getCategories().keySet()) {
            if (count == categoryNumber) {
                return category;
            }
            count++;
        }
        return ""; // Return empty string if no valid category is found
    }

    // Method to handle yes/no input
    private static String getYesOrNoInput(Scanner sc, String prompt) {
        System.out.println(prompt);
        String input = sc.next().trim().toLowerCase();
        return input.equals("yes") || input.equals("no") ? input : "no";
    }

    // Method to handle integer input
    private static int getIntInput(Scanner sc, String prompt) {
        System.out.println(prompt);
        return sc.nextInt(); // Assumes valid integer input from the user
    }
}
