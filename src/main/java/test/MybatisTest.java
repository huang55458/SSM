package test;

import dao.AnimalDao;
import dao.DeptDao;
import dao.EmpDao;
import dao.VehicleDao;
import entity.*;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

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
        EmpDao empDao = appContext.getBean("empDao", EmpDao.class);
        List<HashMap<String, Object>> list = empDao.findBySal();
        for (HashMap<String, Object> h : list) {
            Set<Map.Entry<String, Object>> set = h.entrySet();
            for (Map.Entry<String, Object> m : set) {
                System.out.println(m.getKey() + ":" + m.getValue());
            }
        }
    }

    @Test
    public void testUpdate() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpDao empDao = appContext.getBean("empDao", EmpDao.class);

        Emp emp = new Emp();
        emp.setEmpno(7);
        emp.setEname("ddd");
        emp.setJob("bbb");

        empDao.update(emp);
    }

    /**
     * 测试没有自增的主键映射结果
     */
    @Test
    public void testInsert() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpDao empDao = appContext.getBean("empDao", EmpDao.class);

        Emp emp = new Emp();
        emp.setEname("Fdfdfdf");
        emp.setMgr(5);
        emp.setJob("bbb");
        empDao.save(emp);
        System.out.println(emp.getEname() + " - " + emp.getEmpno());
    }

    @Test
    public void testfindByIdReo() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpDao empDao = appContext.getBean("empDao", EmpDao.class);
        // 传入部门号，返回该部门内所有员工
        List<Emp> emps = empDao.findByIdResultOrm(30);
        for (Emp emp : emps) {
            System.out.println(emp);
        }

    }

    @Test
    public void testfindByIdReo2() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptDao deptDao = appContext.getBean("deptDao", DeptDao.class);
        // 查询 部门号为 30 的部门信息
        Dept dept = deptDao.findByIdReorm(30);
        System.out.println("name: " + dept.getDname());
        System.out.println("loc: " + dept.getLoc());
        System.out.print("员工：");
        List<Emp> list = dept.getEmps();
        for (Emp e : list) {
            System.out.print(e.getEname() + " 、 ");
        }

    }

    @Test
    public void testfindAll2() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptDao deptDao = appContext.getBean("deptDao", DeptDao.class);
        List<Dept> list = deptDao.findAll();
        list.forEach(System.out::println);
    }

    @Test
    public void testfindByIdResultOrm() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptDao deptDao = appContext.getBean("deptDao", DeptDao.class);
        // 查询 部门号为 30 的部门信息
        Dept dept = deptDao.findByIdResultOrm(30);
        System.out.println("deptno: " + dept.getDeptno());
        System.out.println("name: " + dept.getDname());
        System.out.println("loc: " + dept.getLoc());
        System.out.print("员工：");
        List<Emp> list = dept.getEmps();
        for (Emp e : list) {
            System.out.print(e.getEname() + " 、 ");
        }
        System.out.println();
        list.forEach(System.out::println);
    }

    @Test
    public void tesefindAll3() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        VehicleDao vehicleDao = appContext.getBean("vehicleDao", VehicleDao.class);
        List<Vehicle> list = vehicleDao.findAll();
        list.forEach(System.out::println);
    }

    @Test
    public void tesefindAll4() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnimalDao animalDao = appContext.getBean("animalDao", AnimalDao.class);
        List<Animal> list = animalDao.findAll();
        list.forEach(System.out::println);
    }

    @Test
    @Transactional
    public void testInsert2() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SqlSessionFactory sqlSessionFactory = appContext.getBean("sqlSessionFactory", SqlSessionFactory.class);
        SqlSession sqlSession = sqlSessionFactory.openSession(false);
        Dept dept = new Dept();

        dept.setDname("test");
        dept.setLoc("test");
        System.out.println(dept.getDeptno());
        sqlSession.insert("dao.DeptDao.insert", dept);
        System.out.println(dept.getDeptno());

//        // 没有效果
//        if (dept.getDeptno() == 80) {
//            sqlSession.commit();
//        } else {
//            sqlSession.rollback();
//            return;
//        }
        if (dept.getDeptno() != 80) {
            System.out.println("1");
            sqlSession.rollback(true);
        }
        sqlSession.close();
    }
}
