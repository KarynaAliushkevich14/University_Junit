package ModelTest;

import mySimple.DAOImpl.ShoppingCartDaoImpl;
import mySimple.DAOImpl.UserDaoImpl;
import mySimple.ShoppingCart;
import mySimple.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ShoppingCartTest {

    private ShoppingCartDaoImpl shoppingCartDao;

    @BeforeEach
    void initTest() {
        this.shoppingCartDao = new ShoppingCartDaoImpl();
    }

    @AfterEach
    void tearDown() {
        shoppingCartDao = null;
    }

    @Test
    public void getIdTest() throws Exception {
        ShoppingCart cartOne = shoppingCartDao.getShoppingCartById(1);
        int expected = 1;
        int actual = cartOne.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void getAmmountTest() throws Exception {
        ShoppingCart cartOne = shoppingCartDao.getShoppingCartById(1);
        int expected = 2;
        double actual = cartOne.getAmmount();
        assertEquals(expected, actual);
    }

    @Test
    public void getId_ProductTest() throws Exception {
        ShoppingCart cartOne = shoppingCartDao.getShoppingCartById(1);
        int expected = 1;
        int actual = cartOne.getId_product();
        assertEquals(expected, actual);
    }

    @Test
    public void getId_UserTest() throws Exception {
        ShoppingCart cartOne = shoppingCartDao.getShoppingCartById(1);
        int expected = 1;
        int actual = cartOne.getId_user();
        assertEquals(expected, actual);
    }

    @Test
    public void setIdTest() throws Exception {
        ShoppingCart cartOne = shoppingCartDao.getShoppingCartById(1);
        assertThrows(Exception.class, ()->{  cartOne.setId(5);});
    }

    @Test
    public void setAmmountTest() throws Exception {
        ShoppingCart cartOne = shoppingCartDao.getShoppingCartById(1);
        assertThrows(Exception.class, ()->{  cartOne.setAmmount(-1);});
    }


    @Test
    public void setId_UserTest() throws Exception {
        ShoppingCart cartOne = shoppingCartDao.getShoppingCartById(1);
        int expected = 5;
        cartOne.setId_user(5);
        int actual = cartOne.getId_user();
        assertEquals(expected, actual);
    }

    @Test
    public void setId_UserTestNegative() throws Exception {
        ShoppingCart cartOne = shoppingCartDao.getShoppingCartById(1);
        assertThrows(Exception.class, ()->{  cartOne.setId_user(-1);});
    }

    @Test
    public void setId_ProductTestNegative() throws Exception {
        ShoppingCart cartOne = shoppingCartDao.getShoppingCartById(1);
        assertThrows(Exception.class, ()->{  cartOne.setId_product(-1);});
    }
}

