package com.aode.dao;

import com.aode.been.PageBean;
import com.aode.model.MessageList;

/**
 * Created by 黄柏樟 on 2015/10/28.
 */
public interface MessageListDao extends BaseDao<MessageList> {
    public PageBean dataTable(String searchText, PageBean pageBean);
}
