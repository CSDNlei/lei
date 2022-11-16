package com.yilei.lei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yilei.lei.entity.Product;
import com.yilei.lei.service.ProductService;
import com.yilei.lei.mapper.ProductMapper;
import org.springframework.stereotype.Service;

/**
* @author hp
* @description 针对表【product(商品 商品信息相关表：分类表，商品图片表，商品规格表，商品参数表)】的数据库操作Service实现
* @createDate 2022-11-16 22:05:15
*/
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product>
    implements ProductService{

}




