package upao.book_manager_online.services;

import upao.book_manager_online.models.User;

public interface UserService {
    User createUser(User user);
    User getUserById(Long id);
    User getUserByUsername(String username);

    User addUser(User user);

    User updateUser(Long id, User user);
    void deleteUser(Long id);
}
