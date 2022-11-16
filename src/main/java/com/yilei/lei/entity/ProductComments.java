package com.yilei.lei.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品评价 
 * @TableName product_comments
 */
@TableName(value ="product_comments")
@Data
public class ProductComments implements Serializable {
    /**
     * ID
     */
    @TableId(value = "comm_id")
    private String comm_id;

    /**
     * 商品id
     */
    @TableField(value = "product_id")
    private String product_id;

    /**
     * 商品名称
     */
    @TableField(value = "product_name")
    private String product_name;

    /**
     * 订单项(商品快照)ID 可为空
     */
    @TableField(value = "order_item_id")
    private String order_item_id;

    /**
     * 评论用户id 用户名须脱敏
     */
    @TableField(value = "user_id")
    private String user_id;

    /**
     * 是否匿名（1:是，0:否）
     */
    @TableField(value = "is_anonymous")
    private Integer is_anonymous;

    /**
     * 评价类型（1好评，0中评，-1差评）
     */
    @TableField(value = "comm_type")
    private Integer comm_type;

    /**
     * 评价等级 1：好评 2：中评 3：差评
     */
    @TableField(value = "comm_level")
    private Integer comm_level;

    /**
     * 评价内容
     */
    @TableField(value = "comm_content")
    private String comm_content;

    /**
     * 评价晒图(JSON {img1:url1,img2:url2}  )
     */
    @TableField(value = "comm_imgs")
    private String comm_imgs;

    /**
     * 评价时间 可为空
     */
    @TableField(value = "sepc_name")
    private Date sepc_name;

    /**
     * 是否回复（0:未回复，1:已回复）
     */
    @TableField(value = "reply_status")
    private Integer reply_status;

    /**
     * 回复内容
     */
    @TableField(value = "reply_content")
    private String reply_content;

    /**
     * 回复时间
     */
    @TableField(value = "reply_time")
    private Date reply_time;

    /**
     * 是否显示（1:是，0:否）
     */
    @TableField(value = "is_show")
    private Integer is_show;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}