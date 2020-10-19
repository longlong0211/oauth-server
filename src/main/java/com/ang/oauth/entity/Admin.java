package com.ang.oauth.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName(value = "t_admin")
public class Admin {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String username;

    private String password;

    private String mobile;

    private String name;

    private Integer status;

    private Date createTime;

    private Date updateTime;


}
