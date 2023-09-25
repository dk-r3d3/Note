import java.util.ArrayList;
import java.util.List;

public class Category {
    String name;
    List<Product> array;

    public Category(String name) {
        this.name = name;
        this.array = new ArrayList<Product>();
    }

    @Override
    public String toString() {
        return name + " " + array;
    }
}
