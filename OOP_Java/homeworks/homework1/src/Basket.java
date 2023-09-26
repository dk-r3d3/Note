import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Product> productsBuy;

    public Basket() {
        this.productsBuy = new ArrayList<>();
    }
    @Override
    public String toString(){
        return  "The product in basket - " + productsBuy;
    }

    public List<Product> getProductsBuy() {
        return productsBuy;
    }
}
