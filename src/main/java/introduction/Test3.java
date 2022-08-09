package introduction;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");

//        Pet pet = new Dog();
//        Pet pet = context.getBean("myPet", Pet.class);
//        Person person = new Person(pet);

        Person person = context.getBean("myPerson", Person.class);
        person.call();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
