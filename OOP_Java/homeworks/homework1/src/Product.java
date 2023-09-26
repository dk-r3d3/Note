public class Product {
    private String name;
    private int price;
    private Double rating;

    public Product(String name, int price, Double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    @Override
    public String toString(){
        return  name + " is price - "
                + price + "$ with a rating of " + rating;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Double getRating() {
        return rating;
    }
}
