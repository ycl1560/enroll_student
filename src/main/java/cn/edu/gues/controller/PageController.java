package cn.edu.gues.controller;

import cn.edu.gues.entity.AdministratorInfo;
import cn.edu.gues.service.StudentInfoService;
import cn.edu.gues.entity.StudentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author 杨春路
 * @data 2019/10/23 14:24
 */
@Controller
@RequestMapping
public class PageController {
    @Autowired
    private StudentInfoService studentInfoService;

    @RequestMapping("/user")
    public String userLogin(Model model) {
                return "user/login";
    }

    @RequestMapping("/admin")
    public String adminLogin(Model model) {
        return "admin/login";
    }


    @RequestMapping("/admin/product-list")
    public String ProductList(Model model) {
        return "admin/product-list";
    }

    @RequestMapping("/admin/product-add")
    public String ProduceAdd(Model model) {
        return "admin/product-add";
    }

    @RequestMapping("/admin/product-detail")
    public String ProduceDetail(Model model) {
        return "admin/product-detail";
    }

    @RequestMapping("/admin/product-edit")
    public String ProducEdit(Model model) {
        return "admin/product-edit";
    }


    @RequestMapping("/admin/order-list")
    public String Orderlist(Model model) {
        return "/admin/order-list";
    }

    @RequestMapping("/admin/order-detail")
    public String OrderDetail(Model model) {
        return "admin/order-detail";
    }

    @RequestMapping("/admin/order-print")
    public String OrderPrint(Model model) {
        return "admin/order-print";
    }

    @RequestMapping("/admin/order-process")
    public String OrderProcess(Model model) {
        return "admin/order-process";
    }

    @RequestMapping("/admin/index")
    public String Index(Model model) {
        return "admin/index";
    }

  /*  @RequestMapping("/admin/login")
    public String Login(Model model) {
        return "admin/login";
    }*/

    @RequestMapping("/admin/password-change")
    public String PasswordChange(Model model) {
        return "admin/password-change";
    }


    @RequestMapping("/user/welcome1")
    public String Welcome1(Model model) {
        return "user/welcome1";
    }

    @RequestMapping("/user/welcome")
    public String Welcome(Model model) {
        return "user/welcome";
    }

    @RequestMapping("/user/member-list")
    public String MemberList(Model model) {
        return "user/member-list";
    }

    @RequestMapping("/user/member-list1")
    public String MemberList1(Model model) {
        return "user/member-list";
    }

}
