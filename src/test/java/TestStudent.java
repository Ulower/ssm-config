import com.xtf.dao.StudentMapper;

import com.xtf.domain.Student;
import com.xtf.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestStudent {
    @Test
    public void test(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = (StudentService) ctx.getBean("studentService");
        Student student = new Student();
        student.setName("小王");
        System.out.println(student.getId());
        List<Student> insert = studentService.select(student);
        System.out.println(insert);
    }
}
