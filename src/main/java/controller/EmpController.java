package controller;

import dao.EmpDao;
import entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author chumeng
 * @date 2022/7/11 16:02
 */
@Controller
@RequestMapping("emp")
public class EmpController {
    private EmpDao empDao;

    public EmpDao getEmpDao() {
        return empDao;
    }

    @Autowired
    public void setEmpDao(EmpDao empDao) {
        this.empDao = empDao;
    }

    @GetMapping("findAll.form")
    public String findAll(ModelMap modelMap) {
        List<Emp> list = empDao.findAll();
        modelMap.addAttribute("list",list);
        return "hello";
    }
}
