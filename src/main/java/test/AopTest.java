package test;

import controller.EmpController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chumeng
 * @date 2022/7/13 17:54
 */
public class AopTest {
    @Test
    public void testBefore() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpController empController = appContext.getBean(EmpController.class);
        empController.getEmpDao();
    }
}
