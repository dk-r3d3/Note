import java.util.ArrayList;

public class SearchService implements Searchable{

    @Override
    public ArrayList<Book> searchByAuthor(String authorName, ArrayList<Book> bookList) {
        ArrayList<Book> searchResult = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthorName().equals(authorName)){
                searchResult.add(book);
            }
        }
        return searchResult;
    }
}
