package ru.ershov.kataAcademy.service;




import ru.ershov.kataAcademy.models.User;

import java.util.List;

public interface UserService {

    public List<User> allUsers();
    public User getUser(Long id);
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUser(Long id);
}