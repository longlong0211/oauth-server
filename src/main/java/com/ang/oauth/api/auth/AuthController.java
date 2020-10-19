package com.ang.oauth.api.auth;

import com.ang.oauth.utils.RedisUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/api")
public class AuthController {


    @RequestMapping("/index")
    public String index(HttpServletRequest request){
        System.out.println(request);
        RedisUtil.set("key","value");
        return "success";
    }
}
