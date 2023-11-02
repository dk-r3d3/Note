import java.util.ArrayList;

/**
 * Принцип разделения интерфейса
 * Interface Segregation Principle (достигается для разделения на разные интерфейсы)
 */
public interface Searchable {
    ArrayList<Book> searchByAuthor(String authorName, ArrayList<Book> bookList);
}
