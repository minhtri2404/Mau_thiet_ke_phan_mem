package buoi2.baitap.Composition;

public class Pocket {
    // Trường của túi áo
    private String content;

    // Constructor của lớp Pocket
    public Pocket() {
        // Khởi tạo túi áo với nội dung rỗng
        content = "";
    }

    // Phương thức để thiết lập nội dung cho túi áo
    public void setContent(String content) {
        this.content = content;
    }

    // Phương thức để hiển thị nội dung của túi áo
    public void displayContent() {
        System.out.println("Pocket content: " + content);
    }
}
