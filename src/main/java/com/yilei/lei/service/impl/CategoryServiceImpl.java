package com.yilei.lei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yilei.lei.entity.Category;
import com.yilei.lei.service.CategoryService;
import com.yilei.lei.mapper.CategoryMapper;
import org.springframework.stereotype.Service;

/**
* @author hp
* @description 针对表【category(商品分类)】的数据库操作Service实现
* @createDate 2022-11-16 22:00:32
*/
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
    implements CategoryService{

}




