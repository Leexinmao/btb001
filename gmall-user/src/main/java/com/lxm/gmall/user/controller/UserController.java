package com.lxm.gmall.user.controller;

import com.lxm.gmall.user.bean.UmsMember;
import com.lxm.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/hello.do")
    public String index(){
        return "<h1>hello   world</h1>";
    }

    @RequestMapping("/getalluser")
    public List<UmsMember> getAllUser(){

        List<UmsMember> allUser = userService.getAllUser();

        System.out.println("打印成功");
        return allUser;
    }

    @RequestMapping("/geto")
    public List<UmsMember> getOne(){
        System.out.println("ha哈哈哈 ");
        String id = "1";
        List<UmsMember> ts = userService.ts(id);
        System.out.println("ha哈哈哈 ");
        return ts;

    }

}
