package com.xtf.interceptor;
import com.xtf.domain.Student;
import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author xtf
 */
public class Interceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("jinlaile");
        String url = request.getRequestURI();

        //判断url是否公开地址（实际使用时将公开地址配置到配置文件中）
        //这里假设公开地址是否登陆提交的地址
        if(url.indexOf("login") > 0) {
            System.out.println("log为true");
            //如果进行登陆提交，放行
            return true;
        }

        //判断session
        HttpSession session = request.getSession();
        //从session中取出用户身份信息
        System.out.println( session.getAttribute("username"));
        Student username = (Student) session.getAttribute("username");

        if(username != null) {
            return true;
        }
        //执行到这里表示用户身份需要验证，跳转到登陆页面
        request.getRequestDispatcher("/WEB-INF/jsp/log.jsp").forward(request, response);
        System.out.println("走了");
        return false;
    }
}
