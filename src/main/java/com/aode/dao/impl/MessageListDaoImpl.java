package com.aode.dao.impl;

import com.aode.been.PageBean;
import com.aode.dao.MessageListDao;
import com.aode.model.MessageList;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 黄柏樟 on 2015/10/28.
 * @Explain: 通讯录实体模型层
 */
@Component("messageListDao")
public class MessageListDaoImpl extends BaseDaoImpl<MessageList> implements MessageListDao {
    public PageBean dataTable(String searchText,PageBean pageBean){
        if (searchText==null|searchText.trim().isEmpty()){
            String hql = " from MessageList u" ;
            return  this.find(hql,null,pageBean);
        }else {
            String hql = " from MessageList u where u.name like :name  ";
            Map<String, Object> params=new HashMap<String,Object>();
            params.put("name","%"+searchText+"%");
            return  this.find(hql,params,pageBean);
        }


    }
}
