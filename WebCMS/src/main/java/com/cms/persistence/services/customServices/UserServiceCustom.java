package com.cms.persistence.services.customServices;

import com.cms.persistence.dto.UserModelDTO;

import java.util.List;

/**
 * Created by andre on 03/03/17.
 */
public interface UserServiceCustom {

    UserModelDTO getUserModelById(Integer id);

    List getAllUserModels();

}
