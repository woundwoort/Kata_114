package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        userService.createUsersTable();
        userService.saveUser("Илья", "Иванов", (byte) 20);
        userService.saveUser("Мария", "Сергеева", (byte) 30);
        userService.saveUser("Марк", "Ильин", (byte) 40);
        userService.saveUser("Олег", "Олегов", (byte) 40);
        userService.removeUserById(2);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}