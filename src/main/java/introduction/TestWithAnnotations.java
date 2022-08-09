package introduction;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestWithAnnotations {

    public static void main(String[] args) {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

//        Cat myCat = context.getBean("catBean", Cat.class);
//        Cat myCat = context.getBean("cat", Cat.class);
//        myCat.say();

        Person person = context.getBean("personBean", Person.class);
        person.call();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
