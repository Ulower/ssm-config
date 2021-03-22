package com.xtf.dao;

import com.xtf.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Administrator
 */
@Repository
public interface StudentMapper {
    /**
     * update student
     * @param  student student information
     * @return update information
     */
    int update(Student student);

    /**
     * delete student
     * @param  id student id
     * @return delete information
     */
    int delete(int id);

    /**
     * insert student
     * @param  student student class
     * @return insert information
     */
    int insert(Student student);

    /**
     * select student information
     * @return select information
     */
    List<Student> select(Student student);



}
