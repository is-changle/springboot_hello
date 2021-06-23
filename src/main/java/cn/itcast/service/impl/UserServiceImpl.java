package cn.itcast.service.impl;

import cn.itcast.bean.User;
import cn.itcast.dao.UserDao;
import cn.itcast.service.UserService;
import org.hibernate.engine.jdbc.spi.JdbcServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author cl
 * @createTime 2021-06-22
 * @desc
 */


public class UserServiceImpl implements UserService {
    @Autowired
    private JdbcServices userDao;


    @Override
    public void add(User user) {
        userDao.save(user);
    }


}
