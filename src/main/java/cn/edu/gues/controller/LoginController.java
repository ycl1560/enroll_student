package cn.edu.gues.controller;

import cn.edu.gues.entity.AdministratorInfo;
import cn.edu.gues.entity.UserInfo;
import cn.edu.gues.service.AdministratorInfoService;
import cn.edu.gues.service.UserInfoService;
import cn.edu.gues.utils.JsonResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author 杨春路
 * @data 2019/10/24 18:33
 */
@Controller
public class LoginController {
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private AdministratorInfoService administratorInfoService;

    /**
     * 用户登陆
     * @param user
     * @param model
     * @return
     */
    @RequestMapping("/user/login")
    public String UserLogin(UserInfo user, Model model){

        UserInfo userInfo=userInfoService.selectUserInfo(user);
        //String name=userInfo.getUserName();
        if(userInfo!=null) {
            model.addAttribute("userInfo", userInfo);
            return "user/index";
        }
        model.addAttribute("result","failure");
        return "user/login";


        }

    /**
     * 管理员登陆
      * @param administratorInfo
     * @param model
     * @return
     */
    @RequestMapping("/admin/login")
    public String AdminLogin(AdministratorInfo administratorInfo, Model model){

        if(administratorInfo!=null) {
            AdministratorInfo administrator=administratorInfoService.selectAdministratorInfo(administratorInfo);
            model.addAttribute("administratorInfo", administratorInfo);
            return "admin/index";
        }
        model.addAttribute("result","failure");
        return "admin/login";
    }




}
