package coldwarm.spring.helloworld;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("Helloworld");
        obj.getMessage();
        ((ClassPathXmlApplicationContext) context).close();

//        XmlBeanFactory factory = new XmlBeanFactory(
//                new ClassPathResource("Beans.xml"));
//        HelloWorld obj = (HelloWorld) factory.getBean("Helloworld");
//        obj.getMessage();
//          //已经被淘汰

    }
}
