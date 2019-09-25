package com.shuzzzle.mercurii.model;

import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity(name = "role")
@JsonApiResource(type = "role")
public class RoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "roles")
    private Set<UserEntity> users;
}
