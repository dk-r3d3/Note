import java.util.List;

public class HTMLFormatter implements Formatter {

    @Override
    public String formatBook(List<Book> formatBook) {
        return "List of book was brought to the format HTML: " + formatBook;
    }
}
