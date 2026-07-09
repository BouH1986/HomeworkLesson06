public class Main {
    public static void main(String[] args) {

        Author author01 = new Author("Ivan", "Ivanov", 3);
        Author author02 = new Author("Andrew", "Tanenbaum", 10);

        Book book01 = new Book("Book01", 2025, author01, 30);
        Book book02 = new Book("Book02", 2026, author01, 50);
        Book book03 = new Book("Computer Networks", 2022, author02, 960);

        toConsole("IvaN", book01);
        toConsole("Ivanov", book02);
        toConsole("Network", book03);
    }

    public static void toConsole(String word, Book book) {
        System.out.println();
        System.out.println("Это большая книга: " + book.isBig());
        System.out.println("Слово '" + word + "' в названии, имени или фамилии автора: " + book.matches(word));
        System.out.println("Оценка книги: " + book.estimatePrice() + " руб.");
    }
}
