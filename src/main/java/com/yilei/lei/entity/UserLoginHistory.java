package com.yilei.lei.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 登录历史表
 * @TableName user_login_history
 */
@TableName(value ="user_login_history")
@Data
public class UserLoginHistory implements Serializable {
    /**
     * ID
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer ID;

    /**
     * 地区
     */
    @TableField(value = "AREA")
    private String AREA;

    /**
     * 国家
     */
    @TableField(value = "COUNTRY")
    private String COUNTRY;

    /**
     * 用户id
     */
    @TableField(value = "USER_ID")
    private String USER_ID;

    /**
     * IP
     */
    @TableField(value = "IP")
    private String IP;

    /**
     * 时间
     */
    @TableField(value = "LOGIN_TIME")
    private String LOGIN_TIME;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}