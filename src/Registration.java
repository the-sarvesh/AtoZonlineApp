import java.util.Scanner;

class RegistrationModule {
    private String address; // To store the validated address

    public String register(Scanner sc) {
        while (true) {
            try {
                // Validate name
                System.out.println("Enter your name (max 20 characters):");
                String name = sc.next();
                if (name.length() > 20) throw new IllegalArgumentException("Name is too long!");

                // Validate mobile number
                String mobile;
                while (true) {
                    System.out.println("Enter your mobile number (10 digits):");
                    mobile = sc.next();
                    if (mobile.matches("\\d{10}")) {
                        break; // Valid input
                    } else {
                        System.out.println("Invalid mobile number! Please enter a 10-digit number.");
                    }
                }

                // Validate address with pin number
                while (true) {
                    System.out.println("Enter your address (must include pin number):");
                    sc.nextLine(); // Consume leftover newline
                    String inputAddress = sc.nextLine();
                    if (inputAddress.matches(".*\\d{6}.*")) { // Check for 6-digit pin number
                        address = inputAddress; // Save the valid address
                        break; // Exit loop on valid input
                    } else {
                        System.out.println("Address must include a valid pin code! Please try again.");
                    }
                }

                // Validate email
                String email;
                while (true) {
                    System.out.println("Enter your email ID:");
                    email = sc.next();
                    if (email.matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
                        break; // Valid input
                    } else {
                        System.out.println("Invalid email ID! Please enter a valid email.");
                    }
                }

                System.out.println("You have been successfully registered. Welcome to AtoZ Online Application!");
                System.out.println("Name: " + name);
                System.out.println("Mobile: " + mobile);
                System.out.println("Email: " + email);
                System.out.println("Address: " + address);
                break; // Exit registration loop once all inputs are valid
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return address; // Return the saved address
    }

    public String getAddress() {
        return address; // Provide the saved address
    }
}
