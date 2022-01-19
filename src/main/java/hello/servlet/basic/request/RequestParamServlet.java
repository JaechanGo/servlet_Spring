package hello.servlet.basic.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Parameter;
import java.util.Enumeration;

@WebServlet(name="requestParamServlet",urlPatterns = "/request-param-all")
public class RequestParamServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("1. 모든 파라미터 조회 [시작]");
        req.getParameterNames().asIterator().forEachRemaining(ParamNames-> System.out.println(ParamNames + " = " +req.getParameter(ParamNames)));
        System.out.println();

        System.out.println("2. 단일 파라미터  [시작]");
        String username = req.getParameter("username");
        System.out.println(username);
        System.out.println();


        System.out.println("2. 단일 파라미터  [시작]");
        String[] usernames = req.getParameterValues("username");

//        for (int i = 0; i < usernames.length; i++) {
//            System.out.println(usernames[i]);
//        }
        for(String name:usernames){
            System.out.println(" username = " + name);
        }

        System.out.println();
        resp.getWriter().write("ok");

    }
}
