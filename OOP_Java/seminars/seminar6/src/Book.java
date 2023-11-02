/**
 * Принцип Single Responsibility Principle
 * Единственной ответственности
 */

public class Book {
    private String authorName;
    private String description;
    private int releaseData;

    public Book(String authorName, String description, int releaseData) {
        this.authorName = authorName;
        this.description = description;
        this.releaseData = releaseData;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getDescription() {
        return description;
    }

    public int getReleaseData() {
        return releaseData;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setReleaseData(int releaseData) {
        this.releaseData = releaseData;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorName='" + authorName + '\'' +
                ", description='" + description + '\'' +
                ", releaseData=" + releaseData +
                '}';
    }
}
