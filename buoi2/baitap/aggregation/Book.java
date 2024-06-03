package buoi2.baitap.aggregation;

public class Book {
    // Thuộc tính của sách
    private String title;
    private String author;

    // Constructor của lớp Book
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Phương thức getter cho title
    public String getTitle() {
        return title;
    }

    // Phương thức setter cho title
    public void setTitle(String title) {
        this.title = title;
    }

    // Phương thức getter cho author
    public String getAuthor() {
        return author;
    }

    // Phương thức setter cho author
    public void setAuthor(String author) {
        this.author = author;
    }
}


