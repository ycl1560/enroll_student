package cn.edu.gues.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.edu.gues.mapper.CollegeInfoMapper;
/**
*@author 杨春路
*@data 2019/10/24 18:31
*/
@Service
public class CollegeInfoService{

    @Resource
    private CollegeInfoMapper collegeInfoMapper;

}
