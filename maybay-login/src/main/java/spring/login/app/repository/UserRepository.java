package spring.login.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.login.app.entity.User;

public interface UserRepository
        extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
