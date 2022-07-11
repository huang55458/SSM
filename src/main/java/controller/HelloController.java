package controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author chumeng
 * @date 2022/7/11 9:54
 */
//@Controller
//@RequestMapping("hello")
public class HelloController implements Controller {

//    @GetMapping("test.form")
    public String test() {
        return "hello";
    }


    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        return new ModelAndView("hello");
    }
}
