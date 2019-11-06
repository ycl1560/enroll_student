package cn.edu.gues.entity;

import javax.persistence.*;
import lombok.Data;

/**
*@author 杨春路
*@data 2019/10/24 18:31
*/
@Data
@Table(name = "user_info")
public class UserInfo {
    /**
     * 用户编号
     */
    @Id
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 用户密码
     */
    @Column(name = "user_password")
    private String userPassword;

    /**
     * 学号
     */
    @Column(name = "student_sno")
    private String studentSno;

    /**
     * 学生姓名
     */
    @Column(name = "student_name")
    private String studentName;

    /**
     * 年龄
     */
    @Column(name = "student_age")
    private Integer studentAge;

    /**
     * 性别(1:男，2:女，3:未知)
     */
    @Column(name = "student_sex")
    private Short studentSex;

    /**
     * 学院编号
     */
    @Column(name = "student_college_id")
    private Integer studentCollegeId;

    /**
     * 专业名称
     */
    @Column(name = "student_special_name")
    private String studentSpecialName;

    /**
     * 年级信息
     */
    @Column(name = "student_grade")
    private String studentGrade;

    /**
     * 班级名称
     */
    @Column(name = "student_classandgrade")
    private String studentClassandgrade;

    /**
     * 从事行业
     */
    @Column(name = "student_industry")
    private String studentIndustry;

    /**
     * 企业名称
     */
    @Column(name = "company_name")
    private String companyName;

    /**
     * 企业地址
     */
    @Column(name = "company_address")
    private String companyAddress;

    /**
     * 企业电话
     */
    @Column(name = "company_phone")
    private String companyPhone;

    /**
     * 企业法人代表
     */
    @Column(name = "company_corporate_representative")
    private String companyCorporateRepresentative;

    /**
     * 用户角色(4:学生，8:企业)
     */
    @Column(name = "`role`")
    private Short role;
}