package buoi2.baitap.association;

public class Main {
    public static void main(String[] args) {
        // Tạo một trái cây
        Fruit apple = new Fruit("Apple");

        // Tạo một bát và đặt trái cây vào bát
        Bowl bowl = new Bowl(apple);

        // Hiển thị tên của trái cây trong bát
        System.out.println("Trai cay trong cai bat:" + bowl.getFruit().getName());

        // Tạo một trái cây khác và đặt vào bát
        Fruit orange = new Fruit("Orange");
        bowl.setFruit(orange);

        // Hiển thị tên của trái cây trong bát sau khi thay đổi
        System.out.println("Trai cay trong cai bat: " + bowl.getFruit().getName());

        // Gửi thông điệp từ trái cây trong bát
        bowl.showMessage();
    }
}

