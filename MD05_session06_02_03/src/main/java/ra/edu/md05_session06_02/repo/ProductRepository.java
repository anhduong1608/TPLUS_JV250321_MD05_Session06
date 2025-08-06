package ra.edu.md05_session06_02.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ra.edu.md05_session06_02.model.entity.Data;
import ra.edu.md05_session06_02.model.entity.Product;

import java.util.List;

@Repository
public class ProductRepository {

    @Autowired
    private Data data;

    public List<Product> findAll() {
        return data.getProducts();
    }
}
