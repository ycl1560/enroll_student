package cn.edu.gues.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

/**
*@author 杨春路
*@data 2019/10/24 18:31
*/
@Data
@Table(name = "news_info")
public class NewsInfo {
    /**
     * 新闻编号
     */
    @Id
    @Column(name = "news_id")
    private Integer newsId;

    /**
     * 新闻标题
     */
    @Column(name = "news_title")
    private String newsTitle;

    /**
     * 新闻内容
     */
    @Column(name = "news_content")
    private String newsContent;

    /**
     * 新闻添加时间
     */
    @Column(name = "create_time")
    private Date createTime;
}