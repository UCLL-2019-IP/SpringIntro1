package be.ucll.spring.ui;

import be.ucll.spring.domain.Triangle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApplication {
    public static void main (String[] args){
        // without Spring
        //Triangle triangle = new Triangle();

        // with Spring
        // ClassPathXmlApplicationContext -> adds classpath in front of filename automatically
        //ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        // the triangle1 uses setter injection in the xml
        Triangle triangle1 = (Triangle) context.getBean("triangle1");
        // the triangle2 uses constructor injection in the xml
        Triangle triangle2 = (Triangle) context.getBean("triangle2");

        triangle1.draw();
        System.out.println("The type of triangle 1 is: " + triangle1.getType());
        //System.out.println("The type of triangle 1 is: " + triangle1.getType() + " and the height is " + triangle1.getHeight() + ".");

        triangle2.draw();
        System.out.println("The type of triangle 2 is: " + triangle2.getType());
        //System.out.println("The type of triangle 2 is: " + triangle2.getType() + " and the height is " + triangle2.getHeight() + ".");
    }
}
