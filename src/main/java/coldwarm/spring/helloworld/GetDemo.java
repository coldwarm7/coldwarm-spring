package coldwarm.spring.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create by coldwarm on 2018/6/2.
 */


public class GetDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Demo demo = (Demo) context.getBean("demo");
        demo.add();

    }
}
