# AtoZ Online Shopping Application
This is a simple Java-based application designed to simulate an online shopping experience, including user registration, product browsing, cart management, and billing. The application consists of multiple modules such as Registration, Product Catalog, and Billing to handle various aspects of the online shopping process.

Features
User Registration: Validates and registers user details such as name, mobile number, address, and email.
Product Catalog: Displays product categories and allows users to browse products and add them to their cart.
Billing and Checkout: Allows users to view their cart, choose payment methods, and process payments.
Modules
1. Registration Module
Validates user inputs (name, mobile number, address, and email).
Displays confirmation message upon successful registration.
2. Product Module
Displays available product categories.
Allows users to browse products within selected categories.
Products are hardcoded with prices for demonstration purposes.
3. Billing Module
Manages the shopping cart (adds products to the cart).
Allows users to view the cart and proceed to payment.
Supports multiple payment methods (e.g., Cash on Delivery, UPI, Credit Card).
Requirements
Java 8 or higher
A Java IDE like IntelliJ IDEA, Eclipse, or NetBeans
JUnit (if running unit tests)
Setup Instructions
Clone the Repository: Clone the repository to your local machine using the following command:

bash
git clone <repository-url>
Compile the Code: Use your preferred IDE to open the project and compile the code.

Run the Application: The AtoZOnlineApp class contains the main method that starts the application. Run the class from your IDE or via the command line:

bash
java AtoZOnlineApp
Unit Tests: Unit tests are written using JUnit. To run the tests:

Ensure JUnit is installed in your IDE.
Right-click the test class and select "Run" to execute all tests.
How to Use the Application
User Registration: The user will be prompted to enter their name, mobile number, address (with a valid pin code), and email ID. Upon successful registration, a confirmation message will be displayed along with the entered details.

Product Browsing: After registration, the user can view available product categories (Groceries, Fruits, Stationery, etc.). The user selects a category and is shown the products within that category.

Add Products to Cart: The user can add products to their cart by selecting items displayed under the chosen category.

Cart Management and Billing: The user can view their cart, proceed to checkout, and select a payment method (Cash on Delivery, UPI, Credit Card). Upon successful payment, a confirmation message is displayed.

Example Interaction
plaintext
Welcome to AtoZ Online Application!
Enter your name (max 20 characters):
John Doe
Enter your mobile number (10 digits):
1234567890
Enter your address (must include pin number):
123 Main St, Pin: 123456
Enter your email ID:
john.doe@example.com
You have been successfully registered. Welcome to AtoZ Online Application!
Name: John Doe
Mobile: 1234567890
Email: john.doe@example.com
Address: 123 Main St, Pin: 123456

Available Categories:
1. Groceries
2. Fruits
3. Stationery

Enter product category number to select:
1
Selected Category: Groceries
Products in Groceries:
1. Rice - ₹50
2. Apple - ₹30

Enter product number to add to cart:
1
Rice added to cart.

Enter product number to add to cart:
2
Apple added to cart.

Items in Cart:
1. Rice - ₹50
2. Apple - ₹30

Choose payment method: 1. Cash on Delivery, 2. UPI, 3. Credit Card
2
UPI payment. Payment Successful!
Directory Structure
plaintext
AtoZOnlineApp/
├── AtoZOnlineApp.java        # Main application entry point
├── RegistrationModule.java   # Handles user registration logic
├── ProductModule.java        # Handles product categories and listing
├── BillingModule.java        # Manages cart and payment process
└── AtoZOnlineAppTest.java     # Unit tests for the application
Unit Tests
The unit tests are located in the AtoZOnlineAppTest.java file and test various aspects of the application, including:

User registration validation.
Product selection and cart management.
Payment processing.
Conclusion
This application demonstrates how an online shopping system can be implemented in Java. The system offers a user-friendly interface with input validation and supports essential features like registration, product selection, and billing.
