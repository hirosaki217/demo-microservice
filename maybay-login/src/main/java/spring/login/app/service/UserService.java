package spring.login.app.service;

import spring.login.app.auth.UserPrincipal;
import spring.login.app.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
