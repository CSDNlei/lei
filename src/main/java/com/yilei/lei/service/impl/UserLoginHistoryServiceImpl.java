package com.yilei.lei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yilei.lei.entity.UserLoginHistory;
import com.yilei.lei.service.UserLoginHistoryService;
import com.yilei.lei.mapper.UserLoginHistoryMapper;
import org.springframework.stereotype.Service;

/**
* @author hp
* @description 针对表【user_login_history(登录历史表)】的数据库操作Service实现
* @createDate 2022-11-16 22:05:15
*/
@Service
public class UserLoginHistoryServiceImpl extends ServiceImpl<UserLoginHistoryMapper, UserLoginHistory>
    implements UserLoginHistoryService{

}




