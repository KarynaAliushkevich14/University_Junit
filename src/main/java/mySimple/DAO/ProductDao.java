package mySimple.DAO;

import mySimple.Product;
import mySimple.User;

import java.util.List;

public interface ProductDao {

    Product getProductById (int id) throws Exception;

    List<Product> findAllProducts();
}
