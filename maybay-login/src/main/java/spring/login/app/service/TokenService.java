package spring.login.app.service;

import spring.login.app.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}
