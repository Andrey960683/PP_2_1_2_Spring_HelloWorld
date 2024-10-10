import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean2.getMessage());

        Cat cat = applicationContext.getBean("cat", Cat.class);
        System.out.println(cat.getName());
        Cat cat2 = applicationContext.getBean("cat", Cat.class);
        System.out.println(cat2.getName());

        System.out.println(bean == bean2);
        System.out.println(cat == cat2);
    }
}