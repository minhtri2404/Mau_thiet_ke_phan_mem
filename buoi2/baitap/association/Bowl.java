package buoi2.baitap.association;

public class Bowl {
    // Trường, thuộc tính
    private Fruit fruit; // Thể hiện của lớp Fruit

    // Hàm tạo, constructor
    public Bowl(Fruit fruit) {
        this.fruit = fruit;
    }

    // Phương thức thiết lập trái cây vào bát
    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    // Phương thức lấy trái cây từ bát
    public Fruit getFruit() {
        return fruit;
    }

    // Phương thức hiển thị thông điệp từ trái cây trong bát
    public void showMessage() {
        fruit.message();
    }
}

