package com.wolftrace.springmvc6.service;

import com.wolftrace.springmvc6.entity.Admin;
import com.wolftrace.springmvc6.utils.PageBean;

/**
 * @author wolftrace
 * @version 1.0.0
 * @createTime 2018-09-13 9:54
 */
public interface AdminService {
    Admin login(Admin admin);
    PageBean getByPage(Integer pageNo, Integer pageSize);
    Integer delete(Integer id);
    Integer update(Admin admin);
    Integer insert(Admin admin);
    Admin getById(Integer id);
}
