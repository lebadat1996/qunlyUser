package service;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {
    void insertUser(User user) throws SQLException;

    List<User> showListUser();

    public User selectUser(int id);

    boolean updateUser(User user) throws SQLException;

    public boolean deleteUser(int id) throws SQLException;
}
