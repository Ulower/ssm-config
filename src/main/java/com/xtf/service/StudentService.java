package com.xtf.service;

import com.xtf.dao.StudentMapper;
import com.xtf.domain.Student;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xtf
 */
@Service
public class StudentService  {

    @Autowired
    StudentMapper studentMapper;


    public int update(Student student){
        return studentMapper.update(student);
    }

    public int insert(Student student){
       return studentMapper.insert(student);
    }

    public int delete(int id){
       return studentMapper.delete(id);
    }

    public List<Student> select(Student student){
       return studentMapper.select(student);
    }

}
