package com.yilei.lei.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 轮播图 
 * @TableName index_img
 */
@TableName(value ="index_img")
@Data
public class IndexImg implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "img_id")
    private String img_id;

    /**
     * 图片 图片地址
     */
    @TableField(value = "img_url")
    private String img_url;

    /**
     * 背景色 背景颜色
     */
    @TableField(value = "img_bg_color")
    private String img_bg_color;

    /**
     * 商品id 商品id
     */
    @TableField(value = "prod_id")
    private String prod_id;

    /**
     * 商品分类id 商品分类id
     */
    @TableField(value = "category_id")
    private String category_id;

    /**
     * 轮播图类型 轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类
     */
    @TableField(value = "index_type")
    private Integer index_type;

    /**
     * 轮播图展示顺序 轮播图展示顺序，从小到大
     */
    @TableField(value = "seq")
    private Integer seq;

    /**
     * 是否展示:1表示正常显示，0表示下线 是否展示，1：展示    0：不展示
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 创建时间 创建时间
     */
    @TableField(value = "create_time")
    private Date create_time;

    /**
     * 更新时间 更新
     */
    @TableField(value = "update_time")
    private Date update_time;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}