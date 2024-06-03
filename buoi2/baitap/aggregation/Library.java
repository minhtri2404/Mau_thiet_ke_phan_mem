package buoi2.baitap.aggregation;

import java.util.ArrayList;

public class Library {
    // Thuộc tính của thư viện
    private ArrayList<Book> books;
    private String name;

    // Constructor của lớp Library
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Phương thức để thêm sách vào thư viện
    public void addBook(Book book) {
        books.add(book);
    }

    // Phương thức để lấy danh sách các sách trong thư viện
    public ArrayList<Book> getBooks() {
        return books;
    }

    // Phương thức getter cho name
    public String getName() {
        return name;
    }

    // Phương thức setter cho name
    public void setName(String name) {
        this.name = name;
    }
}