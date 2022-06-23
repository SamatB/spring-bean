package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import peaksoft.model.Cat;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloWorld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 =
                applicationContext.getBean("helloWorld", HelloWorld.class);
        System.out.println(bean2.getMessage());
        System.out.println("Result of comparing the helloWorld class links:");
        System.out.println(bean == bean2);
        System.out.println("---------");

        Cat cat = applicationContext.getBean("getCat", Cat.class);
        System.out.println(cat);
        cat.say();

        System.out.println("---------");

        Cat cat1 = applicationContext.getBean("getCat", Cat.class);
        System.out.println(cat1);
        cat1.say();

        System.out.println("---------");
        System.out.println("Result of comparing the cat class links:");
        System.out.println(cat == cat1);

        System.out.println("---------");
        System.out.println(bean.hashCode());
        System.out.println(cat.hashCode());
        System.out.println(cat1.hashCode());

    }
}
