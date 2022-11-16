package com.yilei.lei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yilei.lei.entity.OrderItem;
import com.yilei.lei.service.OrderItemService;
import com.yilei.lei.mapper.OrderItemMapper;
import org.springframework.stereotype.Service;

/**
* @author hp
* @description 针对表【order_item(订单项/快照 )】的数据库操作Service实现
* @createDate 2022-11-16 22:05:15
*/
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem>
    implements OrderItemService{

}




