package cn.edu.gues.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

/**
*@author 杨春路
*@data 2019/10/24 18:31
*/
@Data
@Table(name = "employment_info")
public class EmploymentInfo {
    /**
     * 就业表编号
     */
    @Id
    @Column(name = "employment_id")
    private Integer employmentId;

    /**
     * 从事的行业
     */
    @Column(name = "industry")
    private String industry;

    /**
     * 就业时间
     */
    @Column(name = "employment_time")
    private Date employmentTime;

    /**
     * 就业省份
     */
    @Column(name = "employment_province")
    private String employmentProvince;

    /**
     * 职位名称
     */
    @Column(name = "job_title")
    private String jobTitle;

    /**
     * 就业表创建时间
     */
    @Column(name = "create_time")
    private Date createTime;
}