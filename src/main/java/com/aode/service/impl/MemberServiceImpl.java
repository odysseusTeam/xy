package com.aode.service.impl;

import com.aode.been.PageBean;
import com.aode.dao.BaseDao;
import com.aode.dao.MemberDao;
import com.aode.model.Member;
import com.aode.service.MemberService;
import com.aode.util.Encrypt;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Map;

/**
 * Created by z84935761 on 2015/10/24.
 */
@Service("memberService")
public class MemberServiceImpl extends BaseServiceImpl<Member>  implements MemberService {
    @Autowired
    private MemberDao memberDao;
    public BaseDao<Member> getBaseDao(){
        return memberDao;
    }

    public void save(Member member){
        member.setLoginName(member.getLoginName().trim());
        member.setPassword(Encrypt.e(member.getPassword().trim()));
        memberDao.save(member);
    }
    public void update(Member member){
        member.setLoginName(member.getLoginName().trim());
        member.setPassword(Encrypt.e(member.getPassword().trim()));
        memberDao.update(member);
    }
    @Override
    public Member login(Member member) {
        Assert.hasText(member.getLoginName());
        Assert.hasText(member.getPassword());
        member.setPassword(Encrypt.e(member.getPassword().trim()));
        return this.memberDao.login(member);
    }

    /**
     * datetable 处理
     * @return
     */
    @Override
    public Map dataTable(String searchText,int sEcho,PageBean pageBean){
        pageBean=this.memberDao.dataTable(searchText,pageBean);
        Map<String,Object> map=new HashedMap();
        map.put("sEcho", sEcho+1);//不知道是什么,每次加一就好
        map.put("iTotalRecords", this.count());//当前总数据条数
        map.put("iTotalDisplayRecords", pageBean.getRecordCount());//查询结果的总条数
        map.put("aaData", pageBean.getRecordList());
        return map;
    }
}
