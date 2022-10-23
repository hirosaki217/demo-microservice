package spring.gateway.app.entity;


import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class User extends BaseEntity {

    private String username;

    private String password;


    private Set<Role> roles = new HashSet<>();



}
