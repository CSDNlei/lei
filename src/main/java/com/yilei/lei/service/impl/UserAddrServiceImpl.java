package com.yilei.lei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yilei.lei.entity.UserAddr;
import com.yilei.lei.service.UserAddrService;
import com.yilei.lei.mapper.UserAddrMapper;
import org.springframework.stereotype.Service;

/**
* @author hp
* @description 针对表【user_addr(用户地址)】的数据库操作Service实现
* @createDate 2022-11-16 22:05:15
*/
@Service
public class UserAddrServiceImpl extends ServiceImpl<UserAddrMapper, UserAddr>
    implements UserAddrService{

}




