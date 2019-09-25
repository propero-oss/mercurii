package com.shuzzzle.mercurii.model;

import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Data;

@Data
@JsonApiResource(type = "register", deletable = false, readable = false, postable = false, patchable = false,
        filterable = false, sortable = false)
public class Register {

    public String username;

    public String password;

    public String email;
}
