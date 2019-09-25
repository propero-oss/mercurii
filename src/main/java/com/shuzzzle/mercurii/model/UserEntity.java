package com.shuzzzle.mercurii.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@Entity(name = "user")
@JsonApiResource(type = "user")
@EqualsAndHashCode(of = "id")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;

    private String email;

    @JsonIgnore
    private String password;

    @ManyToMany
    private Set<RoleEntity> roles;

    @CreationTimestamp
    private Date createdAt;
    @UpdateTimestamp
    private Date updatedAt;

}
