package introduction;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {

    public static void main(String[] args) {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog myDog = context.getBean("dog", Dog.class);
        myDog.say();
//        Dog yourDog = context.getBean("dog", Dog.class);

//        System.out.println("Переменные ссылаются на один и тот же объект? " + ((myDog == yourDog) ? "Да!" : "Нет!"));
//        System.out.println(myDog);
//        System.out.println(yourDog);

        context.close();
    }
}
