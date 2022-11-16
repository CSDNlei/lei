package com.yilei.lei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yilei.lei.entity.ProductSku;
import com.yilei.lei.service.ProductSkuService;
import com.yilei.lei.mapper.ProductSkuMapper;
import org.springframework.stereotype.Service;

/**
* @author hp
* @description 针对表【product_sku(商品规格;每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计)】的数据库操作Service实现
* @createDate 2022-11-16 22:05:15
*/
@Service
public class ProductSkuServiceImpl extends ServiceImpl<ProductSkuMapper, ProductSku>
    implements ProductSkuService{

}




