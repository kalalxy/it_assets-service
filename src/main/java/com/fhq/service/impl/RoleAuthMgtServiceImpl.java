package com.fhq.service.impl;

import com.fhq.dao.RoleAuthMgtMapper;
import com.fhq.model.RoleAuthMgt;
import com.fhq.service.RoleAuthMgtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RoleAuthMgtServiceImpl implements RoleAuthMgtService {
    @Autowired
    private RoleAuthMgtMapper roleAuthMgtMapper;
    /**
     * 根据roleId或者roleName获取权限
     * @param entity
     * @return
     */
    @Override
    public List<RoleAuthMgt> getAuthsByRoleIdOrRoleNames(RoleAuthMgt entity) {
        Map map = new HashMap<>();
        StringBuffer tmp;
        if (null != entity && !entity.getRoleId().equals("")) {
            tmp=new StringBuffer();
            tmp.append(" = ").append("'").append(entity.getRoleId()).append("'");
            map.put("roleId", tmp.toString());
            tmp=null;
        }
        if (null != entity.getRole() && !entity.getRole().equals("")) {
            tmp=new StringBuffer();
            tmp.append(" = ").append("'").append(entity.getRole()).append("'");
            map.put("roleName", tmp);
            tmp=null;
        }
        List<RoleAuthMgt> list = this.roleAuthMgtMapper.selectByCondition(map);
        return list;
    }

    /**
     * 新增角色或者角色的权限
     *
     * @param entity
     * @return
     */
    @Override
    public Integer insertRole(RoleAuthMgt entity) {
        Integer insertResult=null;
        try {
            List<RoleAuthMgt> qryResult = this.getAuthsByRoleIdOrRoleNames(entity);
            if (qryResult.size() > 0) {
                for (RoleAuthMgt i : qryResult) {
                    /**
                     * 同样的角色下面权限不能重复
                     */
                    if (i.getAuth() != null && i.getAuth().equals(entity.getAuth())) {
                        throw new Exception("权限重复！");
                    }
                }
            }
            insertResult=this.roleAuthMgtMapper.insertSelective(entity);
        }catch(Exception e){
            e.printStackTrace();
        }
        return insertResult;
    }

    /**
     * 更新角色权限
     *
     * @param entity
     * @return
     */
    @Override
    public Integer updateRole(RoleAuthMgt entity) {
        Integer updateResult=null;
        try{
            updateResult=this.roleAuthMgtMapper.updateByPrimaryKeySelective(entity);
        }catch(Exception e){
            e.printStackTrace();
        }
        return updateResult;
    }

    /**
     * 根据主键进行删除
     *
     * @param idKey
     * @return
     */
    @Override
    public Integer removeRole(Integer idKey) {
        Integer removeResult=null;
        try{
            removeResult=this.roleAuthMgtMapper.deleteByPrimaryKey(idKey);
        }catch(Exception e){
            e.printStackTrace();
        }
        return removeResult;
    }
}
