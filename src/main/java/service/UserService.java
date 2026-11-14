package service;

import entity.User;
import repository.UserRepository;

import java.util.List;

public class UserService {
    private final UserRepository userRepository = new UserRepository();

    public User getId(long id) {
        return userRepository.getUserById(id);
    }

    public List<User> getAll() {
        return userRepository.getAllUsers();
    }

    public void create(User user) {
        userRepository.createUser(user);
    }

    public void update(User user) {
        userRepository.updateUser(user);
    }

    public void delete(long id) {
        userRepository.deleteUser(id);
    }

}
