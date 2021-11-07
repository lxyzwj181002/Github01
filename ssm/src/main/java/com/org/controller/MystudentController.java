package com.org.controller;

import com.org.domain.student;
import com.org.service.StudentService;
import com.org.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/student")
public class MystudentController {
    //自动注入的方式创建对象
    @Autowired
    private StudentService service;
    @RequestMapping("/addstudent.do")
    public ModelAndView addstudent(student stu){
        ModelAndView mv = new ModelAndView();
        int count = service.addStudent(stu);
        String tips = "注册失败！";
        if(count>0){
            tips = "学生"+stu.getName()+"注册成功";
        }
        mv.addObject("tips",tips);
        mv.setViewName("result");
        return mv;
    }
    @RequestMapping("/queryStudent.do")
    @ResponseBody
    public List<student> queryStudent(){
        //参数检查，简单的数据处理
        List<student> stus = service.findStudent();
        for(student stu:stus){
            System.out.println(stu);
        }
        return stus;
    }
}
