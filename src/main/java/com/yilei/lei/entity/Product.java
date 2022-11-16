package com.yilei.lei.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品 商品信息相关表：分类表，商品图片表，商品规格表，商品参数表
 * @TableName product
 */
@TableName(value ="product")
@Data
public class Product implements Serializable {
    /**
     * 商品主键id
     */
    @TableId(value = "product_id")
    private String product_id;

    /**
     * 商品名称 商品名称
     */
    @TableField(value = "product_name")
    private String product_name;

    /**
     * 分类外键id 分类id
     */
    @TableField(value = "category_id")
    private Integer category_id;

    /**
     * 一级分类外键id 一级分类id，用于优化查询
     */
    @TableField(value = "root_category_id")
    private Integer root_category_id;

    /**
     * 销量 累计销售
     */
    @TableField(value = "sold_num")
    private Integer sold_num;

    /**
     * 默认是1，表示正常状态, -1表示删除, 0下架 默认是1，表示正常状态, -1表示删除, 0下架
     */
    @TableField(value = "product_status")
    private Integer product_status;

    /**
     * 商品内容 商品内容
     */
    @TableField(value = "content")
    private String content;

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