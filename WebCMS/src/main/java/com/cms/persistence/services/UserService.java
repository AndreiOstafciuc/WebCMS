package com.cms.persistence.services;

import com.cms.persistence.entities.UserEntity;
import com.cms.persistence.services.customServices.UserServiceCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by andre on 03/03/17.
 */
public interface UserService extends JpaRepository<UserEntity,Integer>, UserServiceCustom {

    @Query("SELECT u FROM UserEntity u WHERE LOWER(u.username) = LOWER(:username)")
    List<UserEntity> findByUsername(@Param("username") String username);

    @Query("SELECT u FROM UserEntity u,UserInfoEntity ui WHERE u.id=ui.id_user AND LOWER(ui.firstName) = LOWER(:firstName)")
    List<UserEntity> findByFirstName(@Param("firstName") String firstName);
}

