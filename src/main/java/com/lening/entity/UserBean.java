package com.lening.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="tb_user")
public class UserBean{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String passWord;
    private Integer age;
    @Transient
    private Integer sage;

}
