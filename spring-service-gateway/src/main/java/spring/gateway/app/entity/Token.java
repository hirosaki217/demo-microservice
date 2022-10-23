package spring.gateway.app.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Token extends BaseEntity {

    private String token;

    private Date tokenExpDate;

}
