package com.ming.cloud.service;

import java.util.List;

import com.ming.cloud.domain.User;

/**
 * @Description UserService
 * @Author weihuiming
 * @Date 2020/7/3
 */
public interface UserService {

    // 创建
    void create(User user);

    // 根据id查询
    User getUser(Long id);

    // 根据id修改
    void update(User user);

    // 根据id删除
    void delete(Long id);

    // 根据名称查询
    User getByUsername(String username);

    // 通过ids查询
    List<User> getUserByIds(List<Long> ids);

}
