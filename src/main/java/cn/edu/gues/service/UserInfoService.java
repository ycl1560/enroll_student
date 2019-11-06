package cn.edu.gues.service;

import cn.edu.gues.entity.UserInfo;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.edu.gues.mapper.UserInfoMapper;

import java.util.List;

/**
*@author 杨春路
*@data 2019/10/24 18:31
*/
@Service
public class UserInfoService{

    @Resource
    private UserInfoMapper userInfoMapper;

    public UserInfo selectUserInfo(UserInfo user) {
        List<UserInfo> userInfos=userInfoMapper.selectAll();
        for (UserInfo userInfo : userInfos) {
            if(user.getUserName().equals(userInfo.getUserName())&&user.getUserPassword().equals(userInfo.getUserPassword())){
                return userInfo;
            }
        }
        return null;
    }
}
