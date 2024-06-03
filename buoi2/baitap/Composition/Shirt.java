package buoi2.baitap.Composition;

public class Shirt {
    // Trường của áo sơ mi
    private Pocket pocket; // Thể hiện quan hệ composition

    // Constructor của lớp Shirt
    public Shirt() {
        pocket = new Pocket(); // Khởi tạo một túi áo mới khi tạo áo sơ mi
    }

    // Phương thức để đặt một mục vào túi áo
    public void putItem(String item) {
        pocket.setContent(item);
    }

    // Phương thức để hiển thị nội dung của túi áo
    public void showPocketContent() {
        pocket.displayContent();
    }
}
