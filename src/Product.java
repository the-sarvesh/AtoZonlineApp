import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class ProductModule {
    private final Map<String, Map<Integer, String>> categories = new LinkedHashMap<>();
    private final Map<String, Double> productPrices = new HashMap<>();

    public ProductModule() {
        // Initialize categories and products
        Map<Integer, String> groceries = new LinkedHashMap<>();
        groceries.put(1, "Rice");
        groceries.put(2, "Wheat");
        groceries.put(3, "Oil");
        categories.put("Groceries", groceries);

        Map<Integer, String> fruits = new LinkedHashMap<>();
        fruits.put(1, "Apple");
        fruits.put(2, "Banana");
        fruits.put(3, "Orange");
        categories.put("Fruits", fruits);

        Map<Integer, String> stationery = new LinkedHashMap<>();
        stationery.put(1, "Notebook");
        stationery.put(2, "Pen");
        stationery.put(3, "Pencil");
        categories.put("Stationery", stationery);

        Map<Integer, String> vegetables = new LinkedHashMap<>();
        vegetables.put(1, "Tomato");
        vegetables.put(2, "Potato");
        vegetables.put(3, "Carrot");
        categories.put("Vegetables", vegetables);

        Map<Integer, String> toys = new LinkedHashMap<>();
        toys.put(1, "Car Toy");
        toys.put(2, "Doll");
        toys.put(3, "Puzzle");
        categories.put("Toys", toys);

        // Add prices for all products
        productPrices.put("Rice", 50.0);
        productPrices.put("Wheat", 40.0);
        productPrices.put("Oil", 100.0);
        productPrices.put("Apple", 30.0);
        productPrices.put("Banana", 10.0);
        productPrices.put("Orange", 20.0);
        productPrices.put("Notebook", 20.0);
        productPrices.put("Pen", 10.0);
        productPrices.put("Pencil", 5.0);
        productPrices.put("Tomato", 25.0);
        productPrices.put("Potato", 20.0);
        productPrices.put("Carrot", 30.0);
        productPrices.put("Car Toy", 150.0);
        productPrices.put("Doll", 200.0);
        productPrices.put("Puzzle", 100.0);
    }

    public Map<String, Map<Integer, String>> getCategories() {
        return categories;
    }

    public void showCategories() {
        int count = 1;
        for (String category : categories.keySet()) {
            System.out.println(count + ". " + category);
            count++;
        }
    }

    public void showProductsInCategory(String category) {
        Map<Integer, String> products = categories.get(category);
        if (products != null) {
            products.forEach((number, product) -> {
                double price = productPrices.get(product);
                System.out.println(number + ". " + product + " - ₹" + price);
            });
        } else {
            System.out.println("Category not found!");
        }
    }

    public Map.Entry<String, Double> getProduct(String category, int productNumber) {
        Map<Integer, String> products = categories.get(category);
        if (products != null && products.containsKey(productNumber)) {
            String productName = products.get(productNumber);
            Double productPrice = productPrices.get(productName);
            return new AbstractMap.SimpleEntry<>(productName, productPrice);
        }
        return null; // Return null if product is not found
    }
}
