package com.sumaojin.suzhenping.hrms.realm;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class AccountRealm extends AuthorizingRealm {
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String principal = (String) authenticationToken.getPrincipal();
        String credential = new String( (char[]) authenticationToken.getCredentials());

        //这里应该是根据用户名从数据库获取账户名和密码来进行校验
        String username = "susu";
        String password = "123456";
        if (username == null){
            throw new AccountException("用户名不正确");
        }else if (!credential.equals(password)){
            throw new AccountException("密码不正确");
        }
        return new SimpleAuthenticationInfo(username,password,getName());
    }
}
