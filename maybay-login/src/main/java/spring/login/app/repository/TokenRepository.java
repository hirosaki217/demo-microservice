package spring.login.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.login.app.entity.Token;

public interface TokenRepository
        extends JpaRepository<Token, Long> {
    Token findByToken(String token);
}
