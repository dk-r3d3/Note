/**
 * Принцип подстановки Барбары Лисков ->
 * Liskov Substitution Principle
 */
public class ElectronBook extends Book{
    private Double bookSize;
    private String bookFormat;

    public ElectronBook(String authorName, String description, int releaseData, Double bookSize, String bookFormat) {
        super(authorName, description, releaseData);
        this.bookSize = bookSize;
        this.bookFormat = bookFormat;
    }

    public Double getBookSize() {
        return bookSize;
    }

    public String getBookFormat() {
        return bookFormat;
    }

    public void setBookSize(Double bookSize) {
        this.bookSize = bookSize;
    }

    public void setBookFormat(String bookFormat) {
        this.bookFormat = bookFormat;
    }

    @Override
    public String toString() {
        return "ElectronBook{" +
                "bookSize=" + bookSize +
                ", bookFormat='" + bookFormat + '\'' +
                '}';
    }
}
