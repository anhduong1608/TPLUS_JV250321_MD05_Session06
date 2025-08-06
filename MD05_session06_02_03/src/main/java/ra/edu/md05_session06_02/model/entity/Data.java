package ra.edu.md05_session06_02.model.entity;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
@Component
public class Data {
    private List<Product> products = new ArrayList<> (List.of(new Product(1, "Laptop Dell", 1500.0, "Laptop hiệu năng cao", "https://example.com/dell.jpg")
        ,new Product(2, "iPhone 15", 1200.0, "Điện thoại Apple mới nhất", "https://example.com/iphone15.jpg")
        ,(new Product(3, "Chuột Logitech", 25.0, "Chuột không dây", "https://example.com/logitech.jpg"))
       ,(new Product(5, "Màn hình LG 27 inch", 300.0, "Màn hình Full HD", "https://example.com/lg27.jpg"))
        ,(new Product(6, "Máy in Canon", 180.0, "In laser trắng đen", "https://example.com/canon.jpg"))
        ,(new Product(7, "Tai nghe Sony", 150.0, "Chống ồn chủ động", "https://example.com/sony.jpg"))
        ,(new Product(8, "Loa Bluetooth JBL", 90.0, "Âm thanh sống động", "https://example.com/jbl.jpg"))
       ,(new Product(9, "Camera an ninh", 120.0, "Camera IP wifi", "https://example.com/camera.jpg"))
        ,(new Product(10, "Pin sạc dự phòng", 35.0, "10000mAh", "https://example.com/pin.jpg"))

    ));

    public List<Product> getProducts() {
        return products;
    }
}



