import java.util.ArrayList;
import java.util.List;

public class Basket {
    List<Product> productsBuy;

    public Basket() {
        this.productsBuy = new ArrayList<Product>();
    }
    @Override
    public String toString(){
        return  "The product in basket - " + productsBuy;
    }
}
