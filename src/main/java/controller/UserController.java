package controller;

import entity.User;
import facade.UserFacade;

import java.time.LocalDate;

public class UserController {
    public static void main(String[] args) {
        UserFacade userFacade = new UserFacade();
        User user1 = new User(0, "Kaliningrad", LocalDate.of(2004, 12, 22), "Ilya");
        userFacade.create(user1);
    }
}
