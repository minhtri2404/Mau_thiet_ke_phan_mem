package buoi2.baitap.association;

public class Fruit {
    // Trường, thuộc tính
    private String name;

    // Hàm tạo, constructor
    public Fruit(String name) {
        this.name = name;
    }

    // Phương thức lấy tên trái cây
    public String getName() {
        return name;
    }

    // Phương thức thiết lập tên trái cây
    public void setName(String name) {
        this.name = name;
    }

    // Phương thức gửi thông điệp
    public void message() {
        System.out.println("Day la lop fruit");
    }
}
