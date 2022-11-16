package com.yilei.lei.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 商品分类
 * @TableName category
 */
@TableName(value ="category")
@Data
public class Category implements Serializable {
    /**
     * 主键 分类id主键
     */
    @TableId(value = "category_id", type = IdType.AUTO)
    private Integer category_id;

    /**
     * 分类名称 分类名称
     */
    @TableField(value = "category_name")
    private String category_name;

    /**
     * 分类层级 分类得类型，
1:一级大分类
2:二级分类
3:三级小分类
     */
    @TableField(value = "category_level")
    private Integer category_level;

    /**
     * 父层级id 父id 上一级依赖的id，1级分类则为0，二级三级分别依赖上一级
     */
    @TableField(value = "parent_id")
    private Integer parent_id;

    /**
     * 图标 logo
     */
    @TableField(value = "category_icon")
    private String category_icon;

    /**
     * 口号
     */
    @TableField(value = "category_slogan")
    private String category_slogan;

    /**
     * 分类图
     */
    @TableField(value = "category_pic")
    private String category_pic;

    /**
     * 背景颜色
     */
    @TableField(value = "category_bg_color")
    private String category_bg_color;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}