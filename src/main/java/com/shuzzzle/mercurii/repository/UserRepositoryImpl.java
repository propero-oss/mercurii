package com.shuzzzle.mercurii.repository;

import com.shuzzzle.mercurii.model.UserEntity;
import io.crnk.data.jpa.JpaEntityRepositoryBase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.Resource;


@Slf4j
@Component
public class UserRepositoryImpl extends JpaEntityRepositoryBase<UserEntity, Long> implements UserRepository {

    @Resource
    public RoleRepository roleRepository;

    @Resource
    public PasswordEncoder passwordEncoder;


    public UserRepositoryImpl() {
        super(UserEntity.class);
    }

    @Override
    public <S extends UserEntity> S create(S resource) {
        Assert.notNull(resource);
        Assert.notNull(passwordEncoder);
        Assert.notNull(resource.getEmail(), "LUL123");
        Assert.notNull(resource.getPassword(), "Macht absolut keinen Sinn!");
        Assert.notNull(passwordEncoder.encode(resource.getPassword()), "NIGGA PLS WTF");

        // Erst hier kommt ne Nullptr Exception WAS?????????? Wie jordelt dass durch die Assertions durch
        // Ist das disabled oder wie
        log.info("Password: " + passwordEncoder.encode(resource.getPassword()));

        return super.create(resource);
    }
}
