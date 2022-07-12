package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chumeng
 * @date 2022/7/11 9:54
 */
@Controller
@RequestMapping("hello")
public class HelloController{

    @GetMapping("test.form")
    public String test() {
        return "hello";
    }


//    @Override
//    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
//        return new ModelAndView("hello");
//    }
}
