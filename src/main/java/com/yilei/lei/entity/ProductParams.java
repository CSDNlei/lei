package com.yilei.lei.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品参数 
 * @TableName product_params
 */
@TableName(value ="product_params")
@Data
public class ProductParams implements Serializable {
    /**
     * 商品参数id
     */
    @TableId(value = "param_id")
    private String param_id;

    /**
     * 商品id
     */
    @TableField(value = "product_id")
    private String product_id;

    /**
     * 产地 产地，例：中国江苏
     */
    @TableField(value = "product_place")
    private String product_place;

    /**
     * 保质期 保质期，例：180天
     */
    @TableField(value = "foot_period")
    private String foot_period;

    /**
     * 品牌名 品牌名，例：三只大灰狼
     */
    @TableField(value = "brand")
    private String brand;

    /**
     * 生产厂名 生产厂名，例：大灰狼工厂
     */
    @TableField(value = "factory_name")
    private String factory_name;

    /**
     * 生产厂址 生产厂址，例：大灰狼生产基地
     */
    @TableField(value = "factory_address")
    private String factory_address;

    /**
     * 包装方式 包装方式，例：袋装
     */
    @TableField(value = "packaging_method")
    private String packaging_method;

    /**
     * 规格重量 规格重量，例：35g
     */
    @TableField(value = "weight")
    private String weight;

    /**
     * 存储方法 存储方法，例：常温5~25°
     */
    @TableField(value = "storage_method")
    private String storage_method;

    /**
     * 食用方式 食用方式，例：开袋即食
     */
    @TableField(value = "eat_method")
    private String eat_method;

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