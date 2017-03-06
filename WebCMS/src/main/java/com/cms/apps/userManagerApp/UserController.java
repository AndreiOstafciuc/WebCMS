package com.cms.apps.userManagerApp;

import com.cms.persistence.entities.UserEntity;
import com.cms.utility.JspPathConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by andre on 03/03/17.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping
    public ModelAndView listUsers() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/web-cms/service/user/";
        List<LinkedHashMap> users = restTemplate.getForObject(url, List.class);
        return new ModelAndView(JspPathConstants.USER_LIST, "users", users);
    }

    @RequestMapping("/{userid}")
    public ModelAndView displayUser(@PathVariable("userid") int userid) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/web-cms/service/user/{userid}";
        UserEntity user = restTemplate.getForObject(url, UserEntity.class, userid);
        return new ModelAndView(JspPathConstants.USER_DETAILS, "user", user);
    }
}
