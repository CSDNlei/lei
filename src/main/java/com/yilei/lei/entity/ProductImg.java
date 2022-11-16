package com.yilei.lei.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品图片
 * @TableName product_img
 */
@TableName(value ="product_img")
@Data
public class ProductImg implements Serializable {
    /**
     * 图片主键
     */
    @TableId(value = "id")
    private String id;

    /**
     * 商品外键id;商品外键id
     */
    @TableField(value = "item_id")
    private String item_id;

    /**
     * 图片地址;图片地址
     */
    @TableField(value = "url")
    private String url;

    /**
     * 顺序;图片顺序，从小到大
     */
    @TableField(value = "sort")
    private Integer sort;

    /**
     * 是否主图;是否主图，1：是，0：否
     */
    @TableField(value = "is_main")
    private Integer is_main;

    /**
     * 创建时间
     */
    @TableField(value = "created_time")
    private Date created_time;

    /**
     * 更新时间
     */
    @TableField(value = "updated_time")
    private Date updated_time;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}