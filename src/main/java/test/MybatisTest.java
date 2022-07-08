package test;

import entity.User;
import mapperInterface.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author chumeng
 * @date 2022/7/8 15:03
 */
public class MybatisTest {
    @Test
    public void testConnect() throws IOException {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = appContext.getBean("userMapper", UserMapper.class);
        List<User> list = userMapper.findAllUser();
        list.forEach(System.out::println);

//        String resource = "SqlMapConfig.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        List<User> list = sqlSession.selectList("findAllUser");
//        list.forEach(System.out::println);
    }
}
