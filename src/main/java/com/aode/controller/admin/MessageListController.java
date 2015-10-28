package com.aode.controller.admin;

import com.aode.been.PageBean;
import com.aode.model.MessageList;
import com.aode.service.MessageListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by admin on 2015/10/28.
 */
@Controller("adminMessageListController")
@RequestMapping("admin/messageList")
public class MessageListController extends BaseAdminController<MessageList>{
    @Autowired
    private MessageListService messageListService;
    @RequestMapping("list")
    public String list(){
        return TEMPLATE_PATH+"list";
    }
    @RequestMapping("dataTable")
    @ResponseBody
    public Map dataTable(String searchText,int sEcho,PageBean pageBean){
        return messageListService.dataTable(searchText,sEcho,pageBean);
    }
}
