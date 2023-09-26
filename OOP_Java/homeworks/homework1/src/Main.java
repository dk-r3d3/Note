import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static List<Product> allProducts = new ArrayList<>();
    static List<Category> allCategories = new ArrayList<>();
    static List<Basket> allBaskets = new ArrayList<>();
    static List<User> allUsers = new ArrayList<>();

    public static void main(String[] args) {
        // create Products
        Product telephone1 = addListAllProducts(new Product("iPhone", 1000, 9.1), allProducts);
        Product telephone2 = addListAllProducts(new Product("Samsung", 900, 9.0), allProducts);
        Product telephone3 = addListAllProducts(new Product("Xiaomi", 500, 8.9), allProducts);
        Product tv1 = addListAllProducts(new Product("YandexTV", 1500, 8.5), allProducts);
        Product tv2 = addListAllProducts(new Product("Sony", 3000, 9.5), allProducts);
        Product fridge1 = addListAllProducts(new Product("Haier", 2300, 9.5), allProducts);

        // create categories
        Category catPhones = new Category("phones");
        Category catTV = new Category("TV");
        Category catFridges = new Category("Fridges");

        // add product in category
        addCategory(telephone1, catPhones.getArrayProducts());
        addCategory(telephone2, catPhones.getArrayProducts());
        addCategory(telephone3, catPhones.getArrayProducts());
        addCategory(tv1, catTV.getArrayProducts());
        addCategory(tv2, catTV.getArrayProducts());
        addCategory(fridge1, catFridges.getArrayProducts());

        // get list all product
        System.out.println(getRes("All products in shop: ", allProducts));

        allCategories.add(catPhones);
        allCategories.add(catTV);
        allCategories.add(catFridges);

        // get list all categories
        System.out.println(getRes("Products by category: ", allCategories));

        // create baskets
        Basket basket1 = new Basket();
        Basket basket2 = new Basket();
        Basket basket3 = new Basket();
        Basket basket4 = new Basket();

        // create users
        User user1 = addListAllUsers(new User("Ivan", "password", basket1), allUsers);
        User user2 = addListAllUsers(new User("Dmitry", "password", basket2), allUsers);
        User user3 = addListAllUsers(new User("Elena", "password", basket3), allUsers);
        User user4 = addListAllUsers(new User("Sergey", "password", basket4), allUsers);

        // filling baskets
        basket1.getProductsBuy().add(telephone1);
        allProducts.remove(telephone1);
        basket1.getProductsBuy().add(fridge1);
        allProducts.remove(fridge1);
        allBaskets.add(basket1);

        basket2.getProductsBuy().add(telephone2);
        allProducts.remove(telephone2);
        allBaskets.add(basket2);

        basket3.getProductsBuy().add(tv1);
        allProducts.remove(tv1);
        allBaskets.add(basket3);

        // get list all bascets
        System.out.println(getRes("Product in baskets: ", allBaskets));
        System.out.println(getRes("List of remaining products: ", allProducts));
        System.out.println(getRes("All users purchases: ", allUsers));
    }

    public static Product addListAllProducts(Product product, List<Product> allProducts) {
        allProducts.add(product);
        return product;
    }

    public static Category addCategory(Product product, List<Product> category) {
        category.add(product);
        return null;
    }

    public static User addListAllUsers(User user, List<User> users) {
        users.add(user);
        return null;
    }

    public static String getRes(String string, List array) {
        System.out.println(string);
        for (Object res : array) {
            System.out.println(res);
        }
        return "_____________________________________";
    }
}