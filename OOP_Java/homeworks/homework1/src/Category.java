import java.util.ArrayList;
import java.util.List;

public class Category {
    private  String nameCategory;
    private List<Product> arrayProducts;

    public Category(String name) {
        this.nameCategory = name;
        this.arrayProducts = new ArrayList<Product>();
    }

    @Override
    public String toString() {
        return nameCategory + " : " + arrayProducts;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public List<Product> getArrayProducts() {
        return arrayProducts;
    }
}
