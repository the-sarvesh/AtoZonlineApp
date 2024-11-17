# AtoZ Online Shopping Application

A simple Java-based application simulating an online shopping experience with features like user registration, product browsing, cart management, and billing.

## Features
- **User Registration**: Validates and registers user details (name, mobile, address, email).
- **Product Catalog**: Browse product categories and add items to the cart.
- **Billing**: View cart, choose payment methods (COD, UPI, Credit Card), and checkout.

## Setup
1. **Clone Repository**:  
   ```bash
   git clone <repository-url>
   ```
2. **Compile & Run**:  
   Run the `AtoZOnlineApp` class via an IDE or the command line:
   ```bash
   java AtoZOnlineApp
   ```

## How to Use
1. Register with name, mobile, address (with pin code), and email.
2. Browse product categories and select items to add to the cart.
3. View the cart, choose a payment method, and confirm the order.

## Directory Structure
```plaintext
AtoZOnlineApp/
├── AtoZOnlineApp.java        # Main application
├── RegistrationModule.java   # Handles registration
├── ProductModule.java        # Manages product catalog
├── BillingModule.java        # Handles cart and billing
└── AtoZOnlineAppTest.java    # Unit tests
```

## Example Interaction
```plaintext
Welcome to AtoZ Online Application!
Enter your name:
John Doe
Enter your mobile:
1234567890
Enter your address (with pin):
123 Main St, Pin: 123456
Enter your email:
john.doe@example.com
You have been successfully registered!

Available Categories:
1. Groceries
2. Fruits
Enter category number: 1
Products in Groceries:
1. Rice - ₹50
Enter product number to add to cart: 1
Rice added to cart.

Choose payment method: 1. COD, 2. UPI, 3. Card
Payment successful via UPI!
```

## Conclusion
This application is a simple yet functional example of an online shopping system. Extend it further by integrating databases, advanced payment gateways, or additional features.
