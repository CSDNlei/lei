package com.yilei.lei.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 购物车 
 * @TableName shopping_cart
 */
@TableName(value ="shopping_cart")
@Data
public class ShoppingCart implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "cart_id", type = IdType.AUTO)
    private Integer cart_id;

    /**
     * 商品ID
     */
    @TableField(value = "product_id")
    private String product_id;

    /**
     * skuID
     */
    @TableField(value = "sku_id")
    private String sku_id;

    /**
     * 用户ID
     */
    @TableField(value = "user_id")
    private String user_id;

    /**
     * 购物车商品数量
     */
    @TableField(value = "cart_num")
    private String cart_num;

    /**
     * 添加购物车时间
     */
    @TableField(value = "cart_time")
    private String cart_time;

    /**
     * 添加购物车时商品价格
     */
    @TableField(value = "product_price")
    private BigDecimal product_price;

    /**
     * 选择的套餐的属性
     */
    @TableField(value = "sku_props")
    private String sku_props;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}