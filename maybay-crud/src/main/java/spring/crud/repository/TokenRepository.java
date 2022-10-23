package spring.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.crud.entity.Token;

public interface TokenRepository
        extends JpaRepository<Token, Long> {
    Token findByToken(String token);
}
