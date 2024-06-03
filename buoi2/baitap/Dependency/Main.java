package buoi2.baitap.Dependency;

public class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng Client
        Client client = new Client();

        // Khách hàng sử dụng dịch vụ từ nhà cung cấp
        client.consume();
    }
}