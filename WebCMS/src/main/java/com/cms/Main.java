package com.cms;

import com.cms.persistence.dto.UserModelDTO;
import com.cms.persistence.services.UserService;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by andre on 03/06/17.
 */
public class Main {
    private static final String APPLICATION_CONTEXT_PATH="file:D:/Faculty/POS/CMS/Git/WebCMS/WebCMS/target/web-cms/WEB-INF/rest-servlet.xml";

    private static UserService userService;

    static{
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(APPLICATION_CONTEXT_PATH);
        userService = context.getBean(UserService.class);
    }

    public static void main(String[] args) {

        List<UserModelDTO> userModelDTOList=userService.getAllUserModels();
        UserModelDTO userModelDTO=userService.getUserModelById(1);

        if(userModelDTOList!=null && userModelDTOList.size()>0){
            for(UserModelDTO um:userModelDTOList){
                System.out.println("UserModelDTO : "+um.toString());
            }
        }

        if(userModelDTO!=null){
            System.out.println("Single UserModelDTO : "+userModelDTO.toString());
        }

    }
}
