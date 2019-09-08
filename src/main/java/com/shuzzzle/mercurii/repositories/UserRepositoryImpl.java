package com.shuzzzle.mercurii.repositories;

import com.shuzzzle.mercurii.models.UserEntity;
import io.crnk.data.jpa.JpaEntityRepositoryBase;
import org.springframework.stereotype.Component;


@Component
public class UserRepositoryImpl extends JpaEntityRepositoryBase<UserEntity, Integer> implements UserRepository {
    public UserRepositoryImpl()
    {
        super(UserEntity.class);
    }

}
