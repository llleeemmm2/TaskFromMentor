package facade;

import entity.User;
import service.UserService;

import java.util.List;

public class UserFacade {
    private final UserService userService = new UserService();

    public User getId(long id) {
        return userService.getId(id);
    }

    public List<User> getAll() {
        return userService.getAll();
    }

    public void create(User user) {
        userService.create(user);
    }

    public void update(User user) {
        userService.update(user);
    }

    public void delete(long id) {
        userService.delete(id);
    }
}
