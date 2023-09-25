import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product telephone1 = new Product("iPhone", 1000, 9.1);
        Product telephone2 = new Product("Samsung", 900, 9.0);
        Product telephone3 = new Product("Xiaomi", 500, 8.9);

        Product tv1 = new Product("YandexTV", 1500, 8.5);
        Product tv2 = new Product("Sony", 3000, 9.5);
        Product fridge1 = new Product("Haier", 2300, 9.5);

        Category catPhones = new Category("phones");
        Category catTV = new Category("TV");
        Category catFridges = new Category("Fridges");

        catPhones.array.add(telephone1);
        catPhones.array.add(telephone2);
        catPhones.array.add(telephone3);
        catTV.array.add(tv1);
        catTV.array.add(tv2);
        catFridges.array.add(fridge1);
        List<Category> allProducts = new ArrayList<>();
        allProducts.add(catTV);
        allProducts.add(catPhones);
        allProducts.add(catFridges);
        System.out.println("Список продуктов магазина: ");
        for (Category category: allProducts) {
            for (Product cat: category.array) {
                System.out.println(cat);
            }
        }
        System.out.println();
//        System.out.println(catPhones.array);
//        System.out.println(catTV.array);
//        System.out.println(catFridges.array);

        Basket basket1 = new Basket();
        Basket basket2 = new Basket();
        Basket basket3 = new Basket();
        Basket basket4 = new Basket();
        User user1 = new User("Ivan", "password", basket1);
        User user2 = new User("Dmitry", "password", basket2);
        User user3 = new User("Elena", "password", basket3);
        User user4 = new User("Sergey", "password", basket4);

        basket1.productsBuy.add(telephone1);
        basket1.productsBuy.add(fridge1);
        catPhones.array.remove(telephone1);
        catFridges.array.remove(fridge1);
        basket2.productsBuy.add(telephone2);
        catPhones.array.remove(telephone2);
        basket4.productsBuy.add(tv1);
        catTV.array.remove(tv1);

        List<Basket> allBaskets = new ArrayList<>();
        allBaskets.add(basket1);
        allBaskets.add(basket2);
        allBaskets.add(basket3);
        allBaskets.add(basket4);

        System.out.println("Список купленных товаров: ");
        for (Basket baskets: allBaskets) {
            for (Product  bask: baskets.productsBuy) {
                System.out.println(bask);
            }
        }
        System.out.println();
        System.out.println("Список оставшихся товаров: ");
        for (Category prod: allProducts){
            for (Product pro: prod.array) {
                System.out.println(pro);
            }
//            System.out.println(prod);
        }


//        System.out.println(user1);
//        System.out.println(user2);
//        System.out.println(user3);
//        System.out.println(catPhones.array);


//
//
//        System.out.println(basket);
//        System.out.println(catPhones.array);
//        User user1 = new User("login", "passw", )
    }
}