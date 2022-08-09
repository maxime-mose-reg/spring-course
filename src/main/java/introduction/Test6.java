package introduction;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Pet cat1 = context.getBean("catBean", Cat.class);
        cat1.say();
        Pet cat2 = context.getBean("catBean", Cat.class);

        Person person1 = context.getBean("personBean", Person.class);
        person1.call();
        Person person2 = context.getBean("personBean", Person.class);

        System.out.println(person1.getSurname());
        System.out.println(person1.getAge());

        context.close();
    }
}
