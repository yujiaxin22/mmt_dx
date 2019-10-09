package com.jiexun.demo.controller;

import com.jiexun.demo.bean.UserInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
        userInfo.setPassword("12345611");
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

    @ApiOperation(value="响应json", notes="添加用户")
    @PostMapping("pondResponse")
    public @ResponseBody Object pondResponse(){
        HashMap<String, Object> resultMap = new HashMap<>();
        resultMap.put("result","0");
        resultMap.put("res_info","成功");
        List<UserInfo> userInfoList  = new ArrayList<>();
        UserInfo userInfo = new UserInfo();
        userInfo.setName("小米");
        userInfo.setPassword("mmm");
        UserInfo userInfo1 = new UserInfo();
        userInfo1.setName("华为");
        userInfo1.setPassword("555");
        userInfoList.add(userInfo);
        userInfoList.add(userInfo1);
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        stringObjectHashMap.put("skuList",userInfoList);
        HashMap<String, HashMap<String, Object>> bigMap = new HashMap<>();
        bigMap.put("bigMap",stringObjectHashMap);
        //stringObjectHashMap.put("skuList2",userInfoList);
        resultMap.put("result_rows",userInfoList);
        resultMap.put("offset",2);
        resultMap.put("limit", 20);
        resultMap.put("total_num", 40);
        return resultMap;
    }
}

