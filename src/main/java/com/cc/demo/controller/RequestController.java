package com.cc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class RequestController {

    @GetMapping("/goto")
    public String gotoPage(HttpServletRequest request){
        request.setAttribute("msg", "ok");
        request.setAttribute("code","200");
        return "forward:/success"; //  redirect to /success
    }

    @ResponseBody
    @GetMapping("/success")
    public Map success(@RequestAttribute("msg") String msg,
                       @RequestAttribute("code") Integer code,
                       HttpServletRequest request){

        Object msg1 = request.getAttribute("msg");

        Map<String,Object> map = new HashMap<>();
        map.put("success_msg", msg1);
        map.put("success_code", code);
        return map;
    }
}
