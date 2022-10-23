package spring.gateway.app.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Role extends BaseEntity {

    private String roleName;

    private String roleKey;

    private Set<Permission> permissions = new HashSet<>();
}
