package spring.gateway.app.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Data
@Getter
@Setter
public abstract class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String deleted;

    private Date createdAt;

    private Date updatedAt;

    private Long createdBy;

    private Long updatedBy;
}
