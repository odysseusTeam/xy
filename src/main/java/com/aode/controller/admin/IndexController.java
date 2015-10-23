package com.aode.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 黄柏樟 on 2015/10/23.
 * @Explain: 测试后台
 */
@Controller("adminIndexController")
@RequestMapping("/admin")
public class IndexController {
    @RequestMapping("index")
    public String index(){
        return "/WEB-INF/admin/index";
    }
}
