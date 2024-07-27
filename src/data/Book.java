package data;

/**
 *
 * @author quang
 */
public class Book {

    private String id;
    private String title;
    private String author;
    private double price;

    public Book() {
    }

    public Book(String id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + '}';
    }

    public static void printTitle() {
        System.out.printf("|%-10s|%-10s|%-10s|%-10s|\n", "MÃ SÁCH", "TIÊU ĐỀ", "TÁC GIẢ", "GIÁ");

    }

    public void printData() {
        System.out.printf("|%-10s|%-10s|%-10s|%-10.1f|\n", id, title, author, price);
    }

   

    
}
