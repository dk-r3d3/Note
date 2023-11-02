public class BookGenre implements Genre{
    private String genreName;

    public BookGenre(String genreName) {
        this.genreName = genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    @Override
    public String toString() {
        return "BookGenre{" +
                "genreName='" + genreName + '\'' +
                '}';
    }

    @Override
    public String getNameGenre() {
        return null;
    }
}
