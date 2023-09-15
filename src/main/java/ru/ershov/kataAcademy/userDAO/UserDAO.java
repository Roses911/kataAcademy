package ru.ershov.kataAcademy.userDAO;


import ru.ershov.kataAcademy.models.User;

import java.util.List;
public interface UserDAO {

    public List<User> allUsers();
    public User getUser(Long id);
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUser(Long id);
}