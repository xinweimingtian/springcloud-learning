package com.ming.cloud.domain;

/**
 * @Description User
 * @Author weihuiming
 * @Date 2020/7/3
 */
public class User {

    // id
    private Long id;
    // 名称
    private String username;
    // 密码
    private String password;

    public User() {
    }

    public User(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
