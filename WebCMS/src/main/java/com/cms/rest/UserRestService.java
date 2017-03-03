package com.cms.rest;

import com.cms.dao.entities.UserEntity;
import com.cms.dao.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by andre on 03/03/17.
 */
@RestController("userServiceController")
@RequestMapping("/service/user/")
public class UserRestService {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET,headers="Accept=application/json")
    public UserEntity getUser(@PathVariable int id) {
        UserEntity user=userService.findOne(id);
        userService.findByFirstName("test2");
        return user;
    }


    @RequestMapping(method = RequestMethod.GET,headers="Accept=application/json")
    public Iterable<UserEntity> getAllUsers() {
        Iterable<UserEntity> allUsers=userService.findAll();
        return allUsers;
    }
}
