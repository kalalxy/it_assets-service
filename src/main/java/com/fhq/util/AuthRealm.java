//package com.fhq.util;
//
//import com.fhq.model.Login;
//import com.fhq.model.RoleAuthMgt;
//import com.fhq.service.impl.LoginServiceImpl;
//import com.fhq.service.impl.RoleAuthMgtServiceImpl;
//import org.apache.shiro.authc.*;
//import org.apache.shiro.authz.AuthorizationInfo;
//import org.apache.shiro.authz.SimpleAuthorizationInfo;
//import org.apache.shiro.realm.AuthorizingRealm;
//import org.apache.shiro.subject.PrincipalCollection;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class AuthRealm extends AuthorizingRealm {
//
//    @Autowired
//    private LoginServiceImpl loginServiceImpl;
//
//    @Autowired
//    private RoleAuthMgtServiceImpl roleAuthMgtServiceImpl;
//
//    //认证.登录
//    @Override
//    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
//        UsernamePasswordToken utoken = (UsernamePasswordToken) token;//获取用户输入的token
//        String username = utoken.getUsername();
//
//        Login Login =new Login();
//        Login.setAccount(username);
//        List<com.fhq.model.Login> list = loginServiceImpl.getUsers(Login);
//        //放入shiro.调用CredentialsMatcher检验密码
//        return new SimpleAuthenticationInfo(list.get(0), list.get(0).getPassword(), this.getClass().getName());
//    }
//
//    //授权
//    @Override
//    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
//        //获取session中的用户
//        Login Login = (com.fhq.model.Login) principal.fromRealm(this.getClass().getName()).iterator().next();
//        List<String> permissions = new ArrayList<>();
//        List<String> roles=new ArrayList<>();
//        Integer roleId = Login.getRoleId();
//        if (roleId != null) {
//            RoleAuthMgt entity = new RoleAuthMgt();
//            entity.setRoleId(roleId.toString());
//            /**
//             * 由角色获取权限
//             */
//            List<RoleAuthMgt> list = this.roleAuthMgtServiceImpl.getAuthsByRoleIdOrRoleNames(entity);
//            for (RoleAuthMgt role : list) {
//                roles.add(role.getRole());
//                permissions.add(role.getAuth());
//
//            }
//        }
//        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
//        /**
//         * 将角色放入shiro
//         */
//        info.addRoles(roles);
//        //将权限放入shiro中.
//        info.addStringPermissions(permissions);
//        return info;
//    }
//}