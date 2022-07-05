package mySimple.DAO;

import mySimple.Product;
import mySimple.ShoppingCart;

public interface ShoppingCartDao {

    ShoppingCart getShoppingCartById (int id) throws Exception;
}
