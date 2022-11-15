package com.lening.dao;

import com.lening.entity.UserBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserDao extends JpaRepository<UserBean,Long> {

    //这个是按照jpa的方式写的，约定好
    UserBean getUserBeanById(Long id);

    //这个是面向对象的查询方式,这个默认就是面向对象
    @Query("from UserBean ")
    List<UserBean> aaaa();

    /**
     * 面向数据库查询
     * 里面的sql前面的属性是value，一定要写在value，千万不能写在name里面
     * nativeQuery的值写成true，注意没有引号
     */
    @Query(value = "select * from tb_user",nativeQuery = true)
    List<UserBean> bbb();


    @Query("select u from UserBean  u")
    List<UserBean> ccc();

}
