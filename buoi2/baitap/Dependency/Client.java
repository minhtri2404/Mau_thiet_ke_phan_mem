package buoi2.baitap.Dependency;

public class Client {
    // Không có thuộc tính hoặc phương thức cụ thể

    // Phương thức của khách hàng
    public void consume() {
        Supplier supplier = new Supplier();
        supplier.provide();
    }
}