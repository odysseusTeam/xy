package com.aode.service;

import com.aode.been.PageBean;
import com.aode.model.MessageList;

import java.util.Map;

/**
 * Created by 黄柏樟 on 2015/10/28.
 */
public interface MessageListService extends  BaseService<MessageList>  {
    public Map dataTable(String searchText, int sEcho, PageBean pageBean);
}
