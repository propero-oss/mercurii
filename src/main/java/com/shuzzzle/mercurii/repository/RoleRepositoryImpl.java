package com.shuzzzle.mercurii.repository;

import com.shuzzzle.mercurii.model.RoleEntity;
import io.crnk.data.jpa.JpaEntityRepositoryBase;
import org.springframework.stereotype.Component;

@Component
public class RoleRepositoryImpl extends JpaEntityRepositoryBase<RoleEntity, Long> implements RoleRepository {
    public RoleRepositoryImpl() {
        super(RoleEntity.class);
    }
}
