import java.util.*;

class Book implements Comparable<Book> {
    private String title;
    private int pageCount;
    private String author;
    private String publicationDate;

    public Book(String title, int pageCount, String author, String publicationDate) {
        this.title = title;
        this.pageCount = pageCount;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    // Getter ve Setter metotları
    public int getPageCount() {
        return pageCount;
    }

    @Override
    public int compareTo(Book otherBook) {
        return this.title.compareTo(otherBook.title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", author='" + author + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        // A'dan Z'ye kitap ismine göre sıralama
        Set<Book> bookSetByName = new TreeSet<>();
        bookSetByName.add(new Book("Java Programming", 400, "John Doe", "2022-01-01"));
        bookSetByName.add(new Book("Python Basics", 300, "Jane Smith", "2022-02-01"));
        bookSetByName.add(new Book("Data Structures", 500, "Alice Johnson", "2022-03-01"));
        bookSetByName.add(new Book("Web Development", 350, "Bob Brown", "2022-04-01"));
        bookSetByName.add(new Book("Algorithms", 450, "Charlie Lee", "2022-05-01"));

        System.out.println("Kitaplar A'dan Z'ye isme göre sıralanmış:");
        for (Book book : bookSetByName) {
            System.out.println(book);
        }

        // Sayfa sayısına göre sıralama
        Set<Book> bookSetByPageCount = new TreeSet<>(Comparator.comparingInt(Book::getPageCount));
        bookSetByPageCount.addAll(bookSetByName);

        System.out.println("\nKitaplar sayfa sayısına göre sıralanmış:");
        for (Book book : bookSetByPageCount) {
            System.out.println(book);
        }
    }
}