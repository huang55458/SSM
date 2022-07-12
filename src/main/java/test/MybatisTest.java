package test;

import dao.EmpDao;
import entity.Condition;
import entity.Emp;
import entity.Param;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author chumeng
 * @date 2022/7/8 15:03
 */
public class MybatisTest {
    @Test
    public void testConnect() throws IOException {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        EmpDao empDao = appContext.getBean("empDao",EmpDao.class);
        List<Emp> list = empDao.findAll();
        list.forEach(System.out::println);

//        UserMapper userMapper = appContext.getBean("userMapper", UserMapper.class);
//        User user = userMapper.findById(1);
//        System.out.println(user);

//        List<User> list = userMapper.findAllUser();
//        list.forEach(System.out::println);

//        String resource = "SqlMapConfig.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        List<User> list = sqlSession.selectList("findAllUser");
//        list.forEach(System.out::println);
    }
    @Test
    public void testFindByDept() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpDao empDao = appContext.getBean("empDao",EmpDao.class);
        Condition condition = new Condition();
        condition.setDeptno(30);
        List<Emp> list = empDao.findByDept(condition);
        list.forEach(System.out::println);
    }
    @Test
    public void testFindBySalary() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpDao empDao = appContext.getBean("empDao",EmpDao.class);
        Condition condition = new Condition();
        condition.setSalary(1600);
        condition.setDeptno(30);
//        List<Emp> list = empDao.findBySalary(condition);
        List<Emp> list = empDao.findByDeptAndSalary(condition);
        list.forEach(System.out::println);
    }
    @Test
    public void test() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpDao empDao = appContext.getBean("empDao",EmpDao.class);
        List<Emp> list = empDao.test();
        list.forEach(System.out::println);
    }
    @Test
    public void testFindByDeptno() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpDao empDao = appContext.getBean("empDao",EmpDao.class);
        Param param = new Param();
        param.setNum1(20);
        param.setNum2(30);
        List<Emp> list = empDao.findByDeptno(param);
        for (Emp e : list) {
            System.out.println(e.getEname() + " - " + e.getJob());
        }
    }
    @Test
    public void testfindBymgr() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpDao empDao = appContext.getBean("empDao",EmpDao.class);
        Param param = new Param();
        param.setArr(new int[]{4,6,7});
        List<Emp> list = empDao.findBymgr(param);
        for (Emp e : list) {
            System.out.println(e.getEname() + " - " + e.getSal() + " - " + e.getMgr());
        }
    }
    @Test
    public void testfindBymgrTwo() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpDao empDao = appContext.getBean("empDao",EmpDao.class);
        Param param = new Param();
//        param.setNum1(7);
        List<Emp> list = empDao.findBymgrTwo(param);
        for (Emp e : list) {
            System.out.println(e);
        }
    }
    @Test
    public void testfindBySal() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpDao empDao = appContext.getBean("empDao",EmpDao.class);
        List<HashMap<String, Object>> list = empDao.findBySal();
        for (HashMap<String, Object> h : list) {
            Set<Map.Entry<String, Object>> set = h.entrySet();
            for (Map.Entry<String, Object> m : set) {
                System.out.println(m.getKey() + ":" + m.getValue());
            }
        }
    }
}
