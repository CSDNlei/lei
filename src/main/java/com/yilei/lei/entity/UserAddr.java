package com.yilei.lei.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户地址
 * @TableName user_addr
 */
@TableName(value ="user_addr")
@Data
public class UserAddr implements Serializable {
    /**
     * 地址主键id
     */
    @TableId(value = "addr_id")
    private Integer addr_id;

    /**
     * 用户ID
     */
    @TableField(value = "user_id")
    private Integer user_id;

    /**
     * 收件人姓名
     */
    @TableField(value = "receiver_name")
    private String receiver_name;

    /**
     * 收件人手机号
     */
    @TableField(value = "receiver_mobile")
    private String receiver_mobile;

    /**
     * 省份
     */
    @TableField(value = "province")
    private String province;

    /**
     * 城市
     */
    @TableField(value = "city")
    private String city;

    /**
     * 区县
     */
    @TableField(value = "area")
    private String area;

    /**
     * 详细地址
     */
    @TableField(value = "addr")
    private String addr;

    /**
     * 邮编
     */
    @TableField(value = "post_code")
    private String post_code;

    /**
     * 状态,1正常，0无效
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 是否默认地址 1是;1:是  0:否
     */
    @TableField(value = "common_addr")
    private Integer common_addr;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date create_time;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date update_time;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}