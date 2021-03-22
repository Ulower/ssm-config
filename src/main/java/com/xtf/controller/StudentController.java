package com.xtf.controller;


import com.xtf.domain.Student;
import com.xtf.service.StudentService;
import com.xtf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
@CrossOrigin
public class StudentController {

    @Autowired
    UserService userService;

    @Autowired
    StudentService studentService;



    @RequestMapping(value = "/tt")
    public String hellos(Model model ,HttpServletRequest httpServletRequest,HttpServletResponse response,String username ) throws IOException {
        String id = httpServletRequest.getParameter("id");
        System.out.println(id);
        return "hello";
    }



    @RequestMapping(value = "/log")
    @ResponseBody
    public String helloss(Model model ,HttpServletRequest httpServletRequest,HttpServletResponse response,String username ) throws IOException {

        Student student = new Student();
        List<Student> select = studentService.select(student);

        return "select";
    }

//    @RequestMapping(value = "/login",method = RequestMethod.GET)
//    public String toLogin(){
//
//        return  "log";
//    }
}
