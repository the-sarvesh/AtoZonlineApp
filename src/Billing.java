import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class BillingModule {
    private final Map<String, Map.Entry<Double, Integer>> cart = new LinkedHashMap<>();

    public void addToCart(String productName, double productPrice) {
        if (cart.containsKey(productName)) {
            // Update quantity if the product already exists in the cart
            int currentQuantity = cart.get(productName).getValue();
            cart.put(productName, Map.entry(productPrice, currentQuantity + 1));
        } else {
            // Add a new product to the cart
            cart.put(productName, Map.entry(productPrice, 1));
        }
        System.out.println(productName + " added to cart.");
    }

    public void showCart() {
        double total = 0;
        System.out.printf("%-20s %-10s %-10s %-10s%n", "Product", "Price", "Quantity", "Total");
        for (Map.Entry<String, Map.Entry<Double, Integer>> entry : cart.entrySet()) {
            String productName = entry.getKey();
            double pricePerUnit = entry.getValue().getKey();
            int quantity = entry.getValue().getValue();
            double totalProductPrice = pricePerUnit * quantity;

            total += totalProductPrice;
            System.out.printf("%-20s %-10.2f %-10d %-10.2f%n", productName, pricePerUnit, quantity, totalProductPrice);
        }
        System.out.println("-------------------------------------------------");
        System.out.printf("%-20s %-10.2f%n", "Total Amount:", total);
    }

    public void processPayment(Scanner sc, String address) { // Address passed as a parameter
        System.out.println("\nChoose payment method:");
        System.out.println("1. Cash on Delivery (COD)");
        System.out.println("2. Paytm / GPay (UPI)");
        System.out.println("3. Debit / Credit Card");

        int method = 0;
        while (method < 1 || method > 3) { // Validating input
            System.out.println("Enter a valid option (1-3):");
            if (sc.hasNextInt()) {
                method = sc.nextInt();
                sc.nextLine(); // Consume newline left by nextInt()
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
                sc.next(); // Consume invalid input
            }
        }

        switch (method) {
            case 1 -> { // Cash on Delivery
                System.out.println("Thank you! Your order will be delivered to:");
                System.out.println(address); // Use the address parameter
                System.out.println("Estimated delivery time: 2-3 hours.");
            }
            case 2 -> { // Paytm / GPay
                System.out.println("Enter your UPI ID or scan the QR code below:");
                System.out.println("[QR Code Placeholder]");
                String upiId = sc.nextLine();
                System.out.println("Payment request sent to UPI ID: " + upiId);
                System.out.println("Payment successful via UPI!");
            }
            case 3 -> { // Debit / Credit Card
                System.out.println("Enter your card number:");
                String cardNumber = sc.nextLine();
                System.out.println("Enter your card expiry date (MM/YY):");
                String expiryDate = sc.nextLine();
                System.out.println("Enter your CVV:");
                String cvv = sc.nextLine();
                System.out.println("Processing payment...");
                System.out.println("Payment successful using card ending with " + cardNumber.substring(cardNumber.length() - 4) + "!");
            }
        }
    }
}
