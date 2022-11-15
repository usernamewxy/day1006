package com.lening.controller;

import com.lening.dao.UserDao;
import com.lening.entity.UserBean;
import com.lening.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/findAll")
    public List<UserBean> findAll(){
        return userService.findAll();
    }
}
