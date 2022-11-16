package com.yilei.lei.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 商品规格;每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计
 * @TableName product_sku
 */
@TableName(value ="product_sku")
@Data
public class ProductSku implements Serializable {
    /**
     * sku编号
     */
    @TableId(value = "sku_id")
    private String sku_id;

    /**
     * 商品id
     */
    @TableField(value = "product_id")
    private String product_id;

    /**
     * sku名称
     */
    @TableField(value = "sku_name")
    private String sku_name;

    /**
     * sku图片
     */
    @TableField(value = "sku_img")
    private String sku_img;

    /**
     * 属性组合（格式是p1:v1;p2:v2）
     */
    @TableField(value = "untitled")
    private String untitled;

    /**
     * 原价
     */
    @TableField(value = "original_price")
    private Integer original_price;

    /**
     * 销售价格
     */
    @TableField(value = "sell_price")
    private Integer sell_price;

    /**
     * 折扣力度
     */
    @TableField(value = "discounts")
    private BigDecimal discounts;

    /**
     * 库存
     */
    @TableField(value = "stock")
    private Integer stock;

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

    /**
     * sku状态(1启用，0禁用，-1删除)
     */
    @TableField(value = "status")
    private Integer status;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}