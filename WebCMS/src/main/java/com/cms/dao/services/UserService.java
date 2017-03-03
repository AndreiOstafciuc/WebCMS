package com.cms.dao.services;

import com.cms.dao.entities.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by andre on 03/03/17.
 */
public interface UserService extends CrudRepository<UserEntity,Integer> {

    @Query("SELECT u FROM UserEntity u WHERE LOWER(u.username) = LOWER(:username)")
    List<UserEntity> findByUsername(@Param("username") String username);

    @Query("SELECT u FROM UserEntity u,UserInfoEntity ui WHERE u.id=ui.id_user AND LOWER(ui.firstName) = LOWER(:firstName)")
    List<UserEntity> findByFirstName(@Param("firstName") String firstName);
}
