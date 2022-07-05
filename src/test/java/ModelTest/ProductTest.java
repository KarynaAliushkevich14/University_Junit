package ModelTest;

import mySimple.DAO.ProductDao;
import mySimple.DAOImpl.ProductDaoImpl;
import mySimple.DAOImpl.UserDaoImpl;
import mySimple.Product;
import mySimple.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ProductTest {
    private ProductDaoImpl productDAO;

    @BeforeEach
    void initTest() {
        this.productDAO = new ProductDaoImpl();
    }

    @AfterEach
    void tearDown() {
        productDAO = null;
    }

    @Test
    public void getIdTest() throws Exception {
        Product laptop = productDAO.getProductById(2);
        int expected = 2;
        int actual = laptop.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void getTitleTest() throws Exception {
        Product laptop = productDAO.getProductById(2);
        String expected = "Laptop";
        String actual = laptop.getTitle();
        assertEquals(expected, actual);
    }

    //inne metody z get są już przetestowane
    @Test
    public void setTitleTest() throws Exception {
        Product laptop = productDAO.getProductById(2);
        laptop.setTitle("Laptop Lenovo");
        final Field field = laptop.getClass().getDeclaredField("title");
        field.setAccessible(true);
        assertEquals("Laptop Lenovo", field.get(laptop), "Expected and actual title didn't match");
    }

    @Test
    public void setDescriptionTest() throws Exception {
        Product laptop = productDAO.getProductById(2);
        laptop.setDescription("Lenovo ThinkPad is a Windows 10 laptop with a 14.00-inch display that has a resolution of 1920x1080 pixels");
        final Field field = laptop.getClass().getDeclaredField("description");
        field.setAccessible(true);
        assertEquals("Lenovo ThinkPad is a Windows 10 laptop with a 14.00-inch display that has a resolution of 1920x1080 pixels", field.get(laptop), "Expected and actual description didn't match");
    }

    @Test
    public void setId_userTest() throws Exception {
        Product laptop = productDAO.getProductById(2);
        laptop.setId_user(4);
        final Field field = laptop.getClass().getDeclaredField("id_user");
        field.setAccessible(true);
        assertEquals(4, field.get(laptop), "Expected and actual id of user didn't match");
    }
}
