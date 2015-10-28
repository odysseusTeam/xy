package com.aode.dao.impl;

import com.aode.been.PageBean;
import com.aode.dao.MemberDao;
import com.aode.model.Member;
import org.hibernate.Query;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by z84935761 on 2015/10/24.
 */
@Component("memberDao")
public class MemberDaoImpl  extends BaseDaoImpl<Member> implements MemberDao {
    @Override
    public Member login(Member member){
        String hql = " from Member u where u.loginName=:loginName and u.password=:password";
        Query q = this.getCurrentSession().createQuery(hql);
        q.setParameter("loginName",member.getLoginName());
        q.setParameter("password", member.getPassword());
        return  (Member)q.uniqueResult();
    }
    public PageBean dataTable(String searchText,PageBean pageBean){
        if (searchText==null|searchText.trim().isEmpty()){
            String hql = " from Member u" ;
            return  this.find(hql,null,pageBean);
        }else {
            String hql = " from Member u where u.loginName like :loginName or u.name like :name or u.email like :email" +
                    " or u.phoneNumber like :phoneNumber or u.address like :address or u.department like :department" +
                    "or u.classes like :classes";
            Map<String, Object> params=new HashMap<String,Object>();
            params.put("loginName","%"+searchText+"%");
            params.put("name","%"+searchText+"%");
            params.put("email","%"+searchText+"%");
            params.put("phoneNumber", "%" + searchText + "%");
            params.put("address","%"+searchText+"%");
            params.put("classes","%"+searchText+"%");
            params.put("department","%"+searchText+"%");
            return  this.find(hql,params,pageBean);
        }


    }
}
