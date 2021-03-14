package com.yl.demo.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Description:
 *
 * @author YangLei
 * @date Created on 2021/3/8
 */
@Data
@Entity(name = "t_user")
public class UserAdmin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;
    @Column(name = "display_name")
    private String displayName;
    @Column(name = "password")
    private String password;
    @Column(name = "token")
    private String token;
    @Column(name = "status")
    private Integer status;

}
