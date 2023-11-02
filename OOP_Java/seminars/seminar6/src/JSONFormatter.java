import java.util.List;

public class JSONFormatter implements Formatter {

    @Override
    public String formatBook(List<Book> formatBook) {
        return "List of book was brought to the format JSON: " + formatBook;
    }
}
