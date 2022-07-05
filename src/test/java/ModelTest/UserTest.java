package ModelTest;

import mySimple.DAOImpl.UserDaoImpl;
import mySimple.Person;
import mySimple.Product;
import mySimple.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    private UserDaoImpl userDAO;

    @BeforeEach
    void initTest() {
        this.userDAO = new UserDaoImpl();
    }

    @AfterEach
    void tearDown() {
        userDAO = null;
    }

    @Test
    public void getIdTest() throws Exception {
        User steve = userDAO.getUserByEmail("steve@gmail.com");
        int expected = 1;
        int actual = steve.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void getAgeTest() throws Exception {
        User steve = userDAO.getUserByEmail("steve@gmail.com");
        int expected = 15;
        int actual = steve.getAge();
        assertEquals(expected, actual);
    }
    @Test
    public void getNameTest() throws Exception {
        User steve = userDAO.getUserByEmail("steve@gmail.com");
        String expected = "steve";
        String actual = steve.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void getPasswordTest() throws Exception {
        User steve = userDAO.getUserByEmail("steve@gmail.com");
        String expected = "steve123";
        String actual = steve.getPassword();
        assertEquals(expected, actual);
    }

    @Test
    public void getPESELTest() throws Exception {
        User steve = userDAO.getUserByEmail("steve@gmail.com");
        String expected = "95012615798";
        String actual = steve.getPESEL();
        assertEquals(expected, actual);
    }

    @Test
    public void getNIPTest() throws Exception {
        User steve = userDAO.getUserByEmail("steve@gmail.com");
        String expected = "1234567891";
        String actual = steve.getNIP();
        assertEquals(expected, actual);
    }

    @Test
    public void getId_shoppingCartTest() throws Exception {
        User steve = userDAO.getUserByEmail("steve@gmail.com");
        int expected = 1;
        int actual = steve.getId_shoppingCart();
        assertEquals(expected, actual);
    }


    @Test
    public void setIdTest() throws Exception {
        User steve = userDAO.getUserByEmail("steve@gmail.com");
        assertThrows(Exception.class, ()->{  steve.setId(7); });
    }


    @Test
    public void setNIPTest() throws Exception {
        User steve = userDAO.getUserByEmail("steve@gmail.com");
        assertThrows(RuntimeException.class, ()->{  steve.setNIP("12345678912"); });

    }

    @Test
    public void setId_shoppingCartTest() throws Exception {
        User steve = userDAO.getUserByEmail("steve@gmail.com");
        assertThrows(Exception.class, ()->{  steve.setId_shoppingCart(5); });
    }


    @Test
    public void setAgeTest() throws Exception {
        Person steve = userDAO.getUserByEmail("steve@gmail.com");
        steve.setAge(30);
        int expected = 30;
        int actual = steve.getAge();
        assertEquals(expected, actual, "Expected and actual age of user didn't match");
    }

    @Test
    public void setAgeTestNegative() throws Exception {
        Person steve = userDAO.getUserByEmail("steve@gmail.com");
        assertThrows(Exception.class, ()->{steve.setAge(-30);});
    }

    @Test
    public void setAgeTestMax() throws Exception {
        Person steve = userDAO.getUserByEmail("steve@gmail.com");
        assertThrows(Exception.class, ()->{steve.setAge(1324);});
    }

    @Test
    public void setNameTest() throws Exception {
        Person steve = userDAO.getUserByEmail("steve@gmail.com");
        steve.setName("Peter");
        String expected = "Peter";
        String actual = steve.getName();
        assertEquals(expected, actual, "Expected and actual name of user didn't match");
    }

    @Test
    public void setNameTest_numberOfLetter() throws Exception {
        Person steve = userDAO.getUserByEmail("steve@gmail.com");
        assertThrows(Exception.class, ()->{steve.setName("PeterPeterPeterPeterPeterPeterPeterPeter123456789");});
    }

    @Test
    public void setEmailTest() throws Exception {
        Person steve = userDAO.getUserByEmail("steve@gmail.com");
        assertThrows(Exception.class, ()->{steve.setEmail("stevegmail.com");});
    }

    @Test
    public void setPasswordTest() throws Exception {
        User steve = userDAO.getUserByEmail("steve@gmail.com");
        String expected = "qwerty";
        steve.setPassword("qwerty");
        String actual = steve.getPassword();
        assertEquals(expected, actual, "Expected and actual password didn't match");
    }

    @Test
    public void setPeselTest() throws Exception {
        User steve = userDAO.getUserByEmail("steve@gmail.com");
        assertThrows(Exception.class, ()->{steve.setPESEL("940515165958");});
    }


}
