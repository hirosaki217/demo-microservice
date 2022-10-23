package spring.crud.service;

import spring.crud.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}
