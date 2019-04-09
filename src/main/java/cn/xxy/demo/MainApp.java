package cn.xxy.demo;

import cn.xxy.demo.di.Car;
import cn.xxy.demo.di.DiJavaCollection;
import cn.xxy.demo.di.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xuxiaoyu on 2019/3/13.
 */
public class MainApp {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
        /*HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.getMessage();
        helloWorld.getMessageParent();*/
        /*AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.getMessage();
        context.registerShutdownHook();*/
        /*Car car = (Car)context.getBean("car");
        car.aa();*/
        /*DiJavaCollection diCollection = (DiJavaCollection) context.getBean("diCollection");
        diCollection.getCityList();
        diCollection.getProvinceSet();
        diCollection.getCountryMap();
        diCollection.getPropPhone();*/

        Student student = (Student) context.getBean("student");
        System.out.println(student.getName() + " : " + student.getAge());
        Car car = (Car)context.getBean("car");
        car.aa();
    }
}
