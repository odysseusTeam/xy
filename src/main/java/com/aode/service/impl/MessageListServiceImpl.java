package com.aode.service.impl;

import com.aode.been.PageBean;
import com.aode.dao.BaseDao;
import com.aode.dao.MessageListDao;
import com.aode.model.MessageList;
import com.aode.service.MessageListService;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by 黄柏樟 on 2015/10/28.
 * @Explain: 通讯录业务逻辑
 */
@Service("messageListService")
public class MessageListServiceImpl extends BaseServiceImpl<MessageList> implements MessageListService {

    @Autowired
    private MessageListDao messageListDao;

    @Override
    protected BaseDao<MessageList> getBaseDao() {
        return messageListDao;
    }

    @Override
    public Map dataTable(String searchText, int sEcho, PageBean pageBean) {
        pageBean=this.messageListDao.dataTable(searchText,pageBean);
        Map<String,Object> map=new HashedMap();
        map.put("sEcho", sEcho+1);//不知道是什么,每次加一就好
        map.put("iTotalRecords", this.count());//当前总数据条数
        map.put("iTotalDisplayRecords", pageBean.getRecordCount());//查询结果的总条数
        map.put("aaData", pageBean.getRecordList());
        return map;
    }
}
