package com.fhq.service;

import com.fhq.model.RoleAuthMgt;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RoleAuthMgtService {
    /**
     * 根据roleId或者roleName获取权限
     * @param entity
     * @return
     */
    List<RoleAuthMgt> getAuthsByRoleIdOrRoleNames(RoleAuthMgt entity);

    /**
     * 新增角色或者角色的权限
     * @param entity
     * @return
     */
    Integer insertRole(RoleAuthMgt entity);

    /**
     * 更新角色权限
     * @param entity
     * @return
     */
    Integer updateRole(RoleAuthMgt entity);

    /**
     * 根据主键进行删除
     * @param idKey
     * @return
     */
    Integer removeRole(Integer idKey);
}
