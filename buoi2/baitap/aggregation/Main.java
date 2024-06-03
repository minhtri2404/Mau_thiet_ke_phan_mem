package buoi2.baitap.aggregation;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        // Tạo một cuốn sách
        Book sach1 = new Book("Harry Potter", "J.K. Rowling");

        // Tạo một thư viện và thêm cuốn sách vào đó
        Library thuVien = new Library("Thu vien cong cong");
        thuVien.addBook(sach1);

        // Hiển thị thông tin của cuốn sách trong thư viện
        ArrayList<Book> booksInLibrary = thuVien.getBooks();
        if (!booksInLibrary.isEmpty()) {
            Book sachTrongThuVien = booksInLibrary.get(0);
            System.out.println("Cuon sach trong thu vien: " + sachTrongThuVien.getTitle() + " cua tac gia " + sachTrongThuVien.getAuthor());
        } else {
            System.out.println("Thu vien khong co sach.");
        }
    }
}

