package cn.itcast.controller;

import cn.itcast.bean.User;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author cl
 * @createTime 2021-06-22
 * @desc  出现问题报错原因:是没有数据库名
 */

@RestController
@RequestMapping
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("HELLO")
    public String hello(String name){
        return "hello,"+ name;
    }

    //1.新增用户
    //post
    //localhost:8081/user/add
    //username=jack
    //password=888
    //nickname=jackma
    //post
    //localhost:8081/user/add
    //username=andy
    //password=666
    //nickname=andyliu
    @PostMapping("add")
    public String add(User user){
        userService.add(user);
        return "success";

    }
    //2.查询所有
    //get
    //localhost:8081/user/findAll

    //3.查询单个
    //get
    //localhost:8081/user/find/1

    //4.带条件查询
    //get
    //localhost:8081/user/findByUsernameAndPassword/jack/888

    //5.修改
    //6.删除

}
