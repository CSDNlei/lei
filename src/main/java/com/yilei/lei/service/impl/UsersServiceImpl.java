package com.yilei.lei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yilei.lei.entity.Users;
import com.yilei.lei.service.UsersService;
import com.yilei.lei.mapper.UsersMapper;
import org.springframework.stereotype.Service;

/**
* @author hp
* @description 针对表【users(用户)】的数据库操作Service实现
* @createDate 2022-11-16 22:05:15
*/
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
    implements UsersService{

}




