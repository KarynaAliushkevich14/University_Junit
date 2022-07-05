package mySimple.DAO;

import mySimple.User;

import java.util.List;

public interface UserDao {

    User getUserByEmail(String email) throws Exception;

    List<User> findAllUsers();
}

