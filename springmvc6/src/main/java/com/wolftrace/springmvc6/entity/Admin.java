package com.wolftrace.springmvc6.entity;

/**
 * @author wolftrace
 * @version 1.0.0
 * @createTime 2018-09-13 9:51
 */
public class Admin {
    private int id;
    private String username;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
