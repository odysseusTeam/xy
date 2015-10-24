package com.aode.dao;

import com.aode.been.PageBean;
import com.aode.model.Member;

/**
 * Created by z84935761 on 2015/10/24.
 */
public interface MemberDao extends BaseDao<Member>{
    public Member login(Member member);
    public PageBean dataTable(String searchText, PageBean pageBean);
}
