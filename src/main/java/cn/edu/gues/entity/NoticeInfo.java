package cn.edu.gues.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

/**
*@author 杨春路
*@data 2019/10/24 18:31
*/
@Data
@Table(name = "notice_info")
public class NoticeInfo {
    /**
     * 公告编号
     */
    @Id
    @Column(name = "notice_id")
    private Integer noticeId;

    /**
     * 公告标题
     */
    @Column(name = "notice_name")
    private String noticeName;

    /**
     * 公告内容
     */
    @Column(name = "notice_content")
    private String noticeContent;

    /**
     * 公告添加时间
     */
    @Column(name = "create_time")
    private Date createTime;
}