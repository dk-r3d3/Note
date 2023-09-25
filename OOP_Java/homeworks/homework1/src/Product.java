public class Product {
    String name;
    int price;
    Double rating;

    public Product(String name, int price, Double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    @Override
    public String toString(){
        return  "The product: " + name + " is price - "
                + price + "$ with a rating of " + rating;
    }
}
