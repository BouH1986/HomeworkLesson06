public class Book {
    public String title;
    public int releaseYear;
    public Author author;
    public int pages;

    public Book(String title, int releaseYear, Author author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig() {
        return (pages > 500) ? true : false;
    }

    public boolean matches(String word) {
        if (title.contains(word) || author.name.contains(word) || author.surname.contains(word)) {
            return true;
        } else {
            return false;
        }
    }

    public int estimatePrice() {
        if ((int) Math.floor(pages * 3 * Math.sqrt(author.rating)) < 250) {
            return 250;
        } else {
            return (int) Math.floor(pages * 3 * Math.sqrt(author.rating));
        }
    }
}
