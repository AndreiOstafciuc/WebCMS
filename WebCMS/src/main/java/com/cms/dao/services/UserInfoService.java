package com.cms.dao.services;

import com.cms.dao.entities.UserInfoEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by andre on 03/03/17.
 */
public interface UserInfoService extends CrudRepository<UserInfoEntity,Integer> {}
