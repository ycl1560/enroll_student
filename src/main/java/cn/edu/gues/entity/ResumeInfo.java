package cn.edu.gues.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

/**
*@author 杨春路
*@data 2019/10/24 18:31
*/
@Data
@Table(name = "resume_info")
public class ResumeInfo {
    /**
     * 简历编号
     */
    @Id
    @Column(name = "resume_id")
    private Integer resumeId;

    /**
     * 简历名称
     */
    @Column(name = "resume_name")
    private String resumeName;

    /**
     * 简历路径
     */
    @Column(name = "resume_address")
    private String resumeAddress;

    /**
     * 简历上传时间
     */
    @Column(name = "resume_updatatime")
    private Date resumeUpdatatime;

    /**
     * 关联的学生编号
     */
    @Column(name = "student_id")
    private Integer studentId;
}