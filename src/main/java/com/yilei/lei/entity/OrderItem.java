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
 * 订单项/快照 
 * @TableName order_item
 */
@TableName(value ="order_item")
@Data
public class OrderItem implements Serializable {
    /**
     * 订单项ID
     */
    @TableId(value = "item_id")
    private String item_id;

    /**
     * 订单ID
     */
    @TableField(value = "order_id")
    private String order_id;

    /**
     * 商品ID
     */
    @TableField(value = "product_id")
    private String product_id;

    /**
     * 商品名称
     */
    @TableField(value = "product_name")
    private String product_name;

    /**
     * 商品图片
     */
    @TableField(value = "product_img")
    private String product_img;

    /**
     * skuID
     */
    @TableField(value = "sku_id")
    private String sku_id;

    /**
     * sku名称
     */
    @TableField(value = "sku_name")
    private String sku_name;

    /**
     * 商品价格
     */
    @TableField(value = "product_price")
    private BigDecimal product_price;

    /**
     * 购买数量
     */
    @TableField(value = "buy_counts")
    private Integer buy_counts;

    /**
     * 商品总金额
     */
    @TableField(value = "total_amount")
    private BigDecimal total_amount;

    /**
     * 加入购物车时间
     */
    @TableField(value = "basket_date")
    private Date basket_date;

    /**
     * 购买时间
     */
    @TableField(value = "buy_time")
    private Date buy_time;

    /**
     * 评论状态： 0 未评价  1 已评价
     */
    @TableField(value = "is_comment")
    private Integer is_comment;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}