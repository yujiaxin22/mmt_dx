package com.jiexun.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("cust")
public class FindCustomer {
    @RequestMapping("findOne")
    public @ResponseBody String getCust(){
        System.out.println("11111111111111");
        System.out.println("2222222222222222222");
        System.out.println("3333333333333333333");
        return "hello cust";
    }
}
