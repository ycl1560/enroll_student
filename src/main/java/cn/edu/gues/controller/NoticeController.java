package cn.edu.gues.controller;

import cn.edu.gues.service.NoticeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 杨春路
 * @data 2019/10/24 18:34
 */

public class NoticeController {
    @Autowired
    private NoticeInfoService noticeInfoService;

    public String queryNoticeInfo(){
        return null;
    }
}
