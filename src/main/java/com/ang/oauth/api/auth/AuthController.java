package com.ang.oauth.api.auth;

import com.ang.oauth.utils.RedisUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class AuthController {


    @RequestMapping("/index")
    public String index(){
        RedisUtil.set("key","value");
        return "success";
    }
}
