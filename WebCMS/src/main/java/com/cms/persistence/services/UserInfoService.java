package com.cms.persistence.services;

import com.cms.persistence.entities.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by andre on 03/03/17.
 */
public interface UserInfoService extends JpaRepository<UserInfoEntity,Integer> {}
