package com.cms.persistence.services.customServices;

import com.cms.persistence.dto.UserModelDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by andre on 03/03/17.
 */
@Repository
public class UserServiceImpl implements UserServiceCustom {

    @PersistenceContext
    private EntityManager em;

    public UserModelDTO getUserModelById(Integer id) {
        String hql="SELECT new com.cms.persistence.dto.UserModelDTO(u.id, ui.firstName, ui.lastName, u.username, u.password) from UserEntity u, UserInfoEntity ui where u.id=ui.id_user and u.id="+id;
        TypedQuery<UserModelDTO> query=em.createQuery(hql,UserModelDTO.class);
        query.setMaxResults(1);
        return query.getSingleResult();
    }

    public List getAllUserModels() {
        String hql="SELECT new com.cms.persistence.dto.UserModelDTO(u.id, ui.firstName, ui.lastName, u.username, u.password) from UserEntity u, UserInfoEntity ui where u.id=ui.id_user";
        TypedQuery<UserModelDTO> query=em.createQuery(hql,UserModelDTO.class);
        return query.getResultList();
    }


}
