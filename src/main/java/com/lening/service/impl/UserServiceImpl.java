package com.lening.service.impl;

import com.lening.dao.UserDao;
import com.lening.entity.UserBean;
import com.lening.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;
    @Resource
    private EntityManager entityManager;

//     @Override
//    public List<UserBean> findAll() {
//       String sql="select * from tb_user";
//        List list = entityManager.createNativeQuery(sql, UserBean.class).getResultList();
//        list.forEach(user->{
//            System.out.println(user);
//      });
//        return list;
//    }


    @Override
    public List<UserBean> findAll(){
        //调用系统根据id查找方法
        UserBean userBean = userDao.findById(8L).get();
        //自己手写根据id查找方法
        UserBean user = userDao.getUserBeanById(3L);
        System.out.println(user);
        System.out.println(userBean);

        List<UserBean> a = userDao.ccc();
        a.forEach(item->{
            System.out.println(item);
        });
        return userDao.findAll();
    }


}
