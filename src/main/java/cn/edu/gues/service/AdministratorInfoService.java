package cn.edu.gues.service;

import cn.edu.gues.entity.AdministratorInfo;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.edu.gues.mapper.AdministratorInfoMapper;

import java.util.List;

/**
 * @author 杨春路
 * @data 2019/10/24 18:30
 */
@Service
public class AdministratorInfoService {

    @Resource
    private AdministratorInfoMapper administratorInfoMapper;

    public AdministratorInfo selectAdministratorInfo(AdministratorInfo administratorInfo) {
        List<AdministratorInfo> administratorInfos=administratorInfoMapper.selectAll();
        for (AdministratorInfo info : administratorInfos) {
            if(administratorInfo.getAdministratorName().equals(info.getAdministratorName())&&administratorInfo.getAdministratorPassword().equals(info.getAdministratorPassword())){
                return info;
            }
        }
        return null;
    }
}

