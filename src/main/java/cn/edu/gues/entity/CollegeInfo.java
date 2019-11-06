package cn.edu.gues.entity;

import javax.persistence.*;
import lombok.Data;

/**
*@author 杨春路
*@data 2019/10/24 18:31
*/
@Data
@Table(name = "college_info")
public class CollegeInfo {
    /**
     * 学院编号
     */
    @Id
    @Column(name = "学院编号")
    private Integer 学院编号;

    /**
     * 学院名称
     */
    @Column(name = "学院名称")
    private String 学院名称;
}