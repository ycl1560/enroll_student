package cn.edu.gues.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

/**
*@author 杨春路
*@data 2019/10/24 18:31
*/
@Data
@Table(name = "document_info")
public class DocumentInfo {
    /**
     * 文档编号
     */
    @Id
    @Column(name = "document_id")
    private Integer documentId;

    /**
     * 文档标题
     */
    @Column(name = "document_title")
    private String documentTitle;

    /**
     * 文档路径
     */
    @Column(name = "document_address")
    private String documentAddress;

    /**
     * 文档上传时间
     */
    @Column(name = "create_time")
    private Date createTime;
}