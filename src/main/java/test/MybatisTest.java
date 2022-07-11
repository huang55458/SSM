package test;

import dao.EmpDao;
import entity.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

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
}
