package com.aode.service;

import com.aode.been.PageBean;
import com.aode.model.Member;

import java.util.Map;

/**
 * Created by z84935761 on 2015/10/24.
 */
public interface MemberService extends  BaseService<Member> {
    public Member login(Member member) ;
    public Map dataTable(String searchText, int sEcho, PageBean pageBean);
}
