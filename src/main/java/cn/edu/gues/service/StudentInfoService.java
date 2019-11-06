package cn.edu.gues.service;

import cn.edu.gues.entity.StudentInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 杨春路
 * @data 2019/10/24 9:33
 */
@Service
public class StudentInfoService {
    private String ID="1";
    private String name="张三";
    private Integer sex=4;
    private Integer age=18;

    public List<StudentInfo> query(){

        List<StudentInfo> list=new ArrayList();
        StudentInfo studentInfo=new StudentInfo();
        StudentInfo studentInfo1=new StudentInfo();
        studentInfo.setStudentAge(18);
        studentInfo.setStudentId("1");
        studentInfo.setStudentName("张三");
        studentInfo.setStudentSex(4);
        list.add(studentInfo);
        studentInfo1.setStudentAge(11);
        studentInfo1.setStudentId("2");
        studentInfo1.setStudentName("王二");
        studentInfo1.setStudentSex(8);
        list.add(studentInfo1);
        System.out.println(list);

        return list;
    }


}
