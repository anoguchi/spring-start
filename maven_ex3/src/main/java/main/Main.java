package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p = context.getBean(Parrot.class);
        Parrot p2 = context.getBean("asd", Parrot.class);
        Parrot p3 = context.getBean("parrot3", Parrot.class);
        System.out.println(p.getName());
        System.out.println(p2.getName());
        System.out.println(p3.getName());
    }
}