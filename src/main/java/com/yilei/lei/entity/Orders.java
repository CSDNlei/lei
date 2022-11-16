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
 * 订单 
 * @TableName orders
 */
@TableName(value ="orders")
@Data
public class Orders implements Serializable {
    /**
     * 订单ID 同时也是订单编号
     */
    @TableId(value = "order_id")
    private String order_id;

    /**
     * 用户ID
     */
    @TableField(value = "user_id")
    private String user_id;

    /**
     * 产品名称（多个产品用,隔开）
     */
    @TableField(value = "untitled")
    private String untitled;

    /**
     * 收货人快照
     */
    @TableField(value = "receiver_name")
    private String receiver_name;

    /**
     * 收货人手机号快照
     */
    @TableField(value = "receiver_mobile")
    private String receiver_mobile;

    /**
     * 收货地址快照
     */
    @TableField(value = "receiver_address")
    private String receiver_address;

    /**
     * 订单总价格
     */
    @TableField(value = "total_amount")
    private BigDecimal total_amount;

    /**
     * 实际支付总价格
     */
    @TableField(value = "actual_amount")
    private Integer actual_amount;

    /**
     * 支付方式 1:微信 2:支付宝
     */
    @TableField(value = "pay_type")
    private Integer pay_type;

    /**
     * 订单备注
     */
    @TableField(value = "order_remark")
    private String order_remark;

    /**
     * 订单状态 1:待付款 2:待发货 3:待收货 4:待评价 5:已完成 6:已关闭
     */
    @TableField(value = "status")
    private String status;

    /**
     * 配送方式
     */
    @TableField(value = "delivery_type")
    private String delivery_type;

    /**
     * 物流单号
     */
    @TableField(value = "delivery_flow_id")
    private String delivery_flow_id;

    /**
     * 订单运费 默认可以为零，代表包邮
     */
    @TableField(value = "order_freight")
    private BigDecimal order_freight;

    /**
     * 逻辑删除状态 1: 删除 0:未删除
     */
    @TableField(value = "delete_status")
    private Integer delete_status;

    /**
     * 创建时间（成交时间）
     */
    @TableField(value = "create_time")
    private Date create_time;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date update_time;

    /**
     * 付款时间
     */
    @TableField(value = "pay_time")
    private Date pay_time;

    /**
     * 发货时间
     */
    @TableField(value = "delivery_time")
    private Date delivery_time;

    /**
     * 完成时间
     */
    @TableField(value = "flish_time")
    private Date flish_time;

    /**
     * 取消时间
     */
    @TableField(value = "cancel_time")
    private Date cancel_time;

    /**
     * 订单关闭类型1-超时未支付 2-退款关闭 4-买家取消 15-已通过货到付款交易
     */
    @TableField(value = "close_type")
    private Integer close_type;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}