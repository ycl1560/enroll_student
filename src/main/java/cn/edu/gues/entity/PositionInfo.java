package cn.edu.gues.entity;

import javax.persistence.*;
import lombok.Data;

/**
*@author 杨春路
*@data 2019/10/24 18:31
*/
@Data
@Table(name = "position_info")
public class PositionInfo {
    /**
     * 职位编号
     */
    @Id
    @Column(name = "position_id")
    private Integer positionId;

    /**
     * 工作地点
     */
    @Column(name = "position_address")
    private String positionAddress;

    /**
     * 工作类型
     */
    @Column(name = "position_type")
    private String positionType;

    /**
     * 工作年限
     */
    @Column(name = "position_years")
    private Integer positionYears;

    /**
     * 工作性别要求(1:男，2:女，3:不限)
     */
    @Column(name = "position_sex")
    private Short positionSex;

    /**
     * 学历
     */
    @Column(name = "position_education_background")
    private String positionEducationBackground;

    /**
     * 工作月薪
     */
    @Column(name = "position_monthly_pay")
    private Integer positionMonthlyPay;

    /**
     * 招聘人数
     */
    @Column(name = "position_person_count")
    private Integer positionPersonCount;

    /**
     * 职位名称
     */
    @Column(name = "position_name")
    private String positionName;

    /**
     * 职位描述
     */
    @Column(name = "position_detail")
    private String positionDetail;

    /**
     * 职位发布人编号
     */
    @Column(name = "position_user_id")
    private Integer positionUserId;

    /**
     * 工作省份
     */
    @Column(name = "position_province")
    private String positionProvince;
}