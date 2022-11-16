package com.yilei.lei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yilei.lei.entity.Orders;
import com.yilei.lei.service.OrdersService;
import com.yilei.lei.mapper.OrdersMapper;
import org.springframework.stereotype.Service;

/**
* @author hp
* @description 针对表【orders(订单 )】的数据库操作Service实现
* @createDate 2022-11-16 22:05:15
*/
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders>
    implements OrdersService{

}




