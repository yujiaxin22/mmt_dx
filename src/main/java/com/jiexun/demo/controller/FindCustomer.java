package com.jiexun.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("cust")
public class FindCustomer {
    @RequestMapping("findOne")
    public @ResponseBody String getCust(){
        System.out.println("222222222222");
        return "hello cust";
    }
}
