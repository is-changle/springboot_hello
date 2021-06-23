package cn.itcast.dao;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author cl
 * @createTime 2021-06-22
 * @desc  注意使用的springdatajpa,
 */


public interface UserDao extends JpaRepository<User,Long> {
}
