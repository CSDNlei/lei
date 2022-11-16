package com.yilei.lei.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yilei.lei.entity.Category;

/**
* @author hp
* @description 针对表【category(商品分类)】的数据库操作Mapper
* @createDate 2022-11-16 22:00:32
* @Entity com.yilei.lei.entity.Category
*/
public interface CategoryMapper extends BaseMapper<Category> {
    int insertAll(Category category);
}




