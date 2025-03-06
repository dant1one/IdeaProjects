import java.util.Arrays;
import java.util.Objects;

public class Book {
    private String title;
    private String[] author;
    private int pages;
    private static String owner;

    public Book() {
        this.author = new String[2];
    }

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = new String[2];
        this.author[0] = author;
        this.pages = pages;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        Book.owner = owner;
    }

    public static void resetOwner() {
        owner = "";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public String getAuthor() {
        return this.author[0];
    }

    public void setAuthor(String newAuthor) {
        this.author[0] = newAuthor;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int newPages) {
        this.pages = newPages;
    }

    @Override
    public String toString() {
        return "Book " +
                "title='" + title + '\'' +
                ", author=" + Arrays.toString(author) +
                ", pages=" + pages +
                ", owner=" + owner
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return getPages() == book.getPages() && Objects.equals(getTitle(), book.getTitle()) && Objects.deepEquals(getAuthor(), book.getAuthor());
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Harry Potter", "J.K Rowling", 700);
        Book b3 = new Book("Harry Potter", "J.K Rowling", 700);

        System.out.println("Info about b1: " + b1.getTitle() + ", " + b1.getAuthor() + ", " + b1.getPages());
        System.out.println("Info about b2: " + b2.getTitle() + ", " + b2.getAuthor() + ", " + b2.getPages());
        System.out.println("Info about b3: " + b3.getTitle() + ", " + b3.getAuthor() + ", " + b3.getPages());
        b1.setOwner("LOLOLO");
        System.out.println(b1.getOwner());
        System.out.println(b1 + " ||||| " + b2);
        if (b2.equals(b3)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
