package com.yilei.lei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yilei.lei.entity.ProductComments;
import com.yilei.lei.service.ProductCommentsService;
import com.yilei.lei.mapper.ProductCommentsMapper;
import org.springframework.stereotype.Service;

/**
* @author hp
* @description 针对表【product_comments(商品评价 )】的数据库操作Service实现
* @createDate 2022-11-16 22:05:15
*/
@Service
public class ProductCommentsServiceImpl extends ServiceImpl<ProductCommentsMapper, ProductComments>
    implements ProductCommentsService{

}




