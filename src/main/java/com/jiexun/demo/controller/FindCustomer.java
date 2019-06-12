package com.jiexun.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("cust")
public class FindCustomer {
    @RequestMapping("findOne")
    public @ResponseBody String getCust(){
        return "hello cust";
    }
}
