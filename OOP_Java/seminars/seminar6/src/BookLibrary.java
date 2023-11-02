import java.util.ArrayList;

public class BookLibrary {
    ArrayList<Book> bookList;

    public BookLibrary(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public BookLibrary() {
        this.bookList = new ArrayList<>();
    }

    public BookLibrary(int listSize) {
        this.bookList = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            bookList.add(new Book("Pushkin" + i,
                    "Evgeni Onegin",
                    1850));
        }
    }

    @Override
    public String toString() {
        return "BookLibrary{" +
                "bookList=" + bookList +
                '}';
    }
}
