package spring.gateway.app.entity;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Permission extends BaseEntity {

    private String permissionName;

    private String permissionKey;

}