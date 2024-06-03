package buoi2.baitap.Composition;

public class Main {
    public static void main(String[] args) {
        // Tạo một áo sơ mi mới
        Shirt shirt = new Shirt();

        // Đặt một mục vào túi áo
        shirt.putItem("Phone");

        // Hiển thị nội dung của túi áo
        shirt.showPocketContent();
    }
}

