package com.cms.entities;

import javax.persistence.*;

/**
 * @program: webapi
 * @description: 角色信息
 * @author: Leo
 * @create: 2018-11-09 11:19
 **/
@Entity
@Table(name = "roles")
public class Role extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    private Integer id;

    @Column(name = "role_name",nullable = false)
    private String roleName;

    @Override
    public String toString()
    {
        return this.toString();
    }
}