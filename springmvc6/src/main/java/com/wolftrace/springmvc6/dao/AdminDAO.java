package com.wolftrace.springmvc6.dao;

import com.wolftrace.springmvc6.entity.Admin;
import com.wolftrace.springmvc6.utils.PageBean;

import java.util.List;

/**
 * @author wolftrace
 * @version 1.0.0
 * @createTime 2018-09-13 9:52
 */
public interface AdminDAO {
     Admin login(Admin admin);
     List<Admin> list();
     Admin getById(Integer id);
     Integer update(Admin admin);
     Integer delete(Integer id);
     List<Admin> getByPage(Integer pageNo, Integer pageSize);
    Integer getTotalCount();
    Integer insert(Admin admin);
}
