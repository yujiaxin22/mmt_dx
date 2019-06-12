package com.jiexun.demo.controller;

import com.jiexun.demo.bean.UserInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("User")
@Api(description = "用户相关接口")
@CrossOrigin
public class FindUserController {
    @ApiOperation(value="查询单个用户", notes="查询单个用户")
    @GetMapping("findOne")
    public @ResponseBody UserInfo findOne(){
        UserInfo userInfo = new UserInfo();
        userInfo.setName("yujiaxin");
        userInfo.setPassword("123456");
        return  userInfo;
    }
    @ApiOperation(value="添加用户", notes="添加用户")
    @PostMapping("findByCondition")
    public @ResponseBody UserInfo findByCondition(@RequestParam(value = "id") int id,@RequestParam(value = "name") String name){
        UserInfo userInfo = new UserInfo();
        userInfo.setName("yujiaxin"+id);
        userInfo.setPassword(name);
        return  userInfo;
    }
}

