package introduction;

import org.springframework.beans.factory.annotation.Value;

//@Component("personBean")
public class Person {

    //    @Autowired
    private Pet pet;

    //        @Value("Smith")
    @Value("${person.surname}")
    private String surname;

    //    @Value("33")
    @Value("${person.age}")
    private int age;

    public Person() {
        System.out.println("Person bean is created!");
    }

    //    @Autowired
    public Person(
//            @Qualifier("catBean")
            Pet pet) {
        this.pet = pet;
        System.out.println("Person bean is created!");
    }

    //        @Autowired
//    @Qualifier("dog")
    public void setPet(Pet pet) {
        this.pet = pet;
        System.out.println("Class Person: set pet");
    }

//    @Autowired
//    public void anyMethodName(Pet pet) {
//        this.pet = pet;
//        System.out.println("Class Person: anyMethodName");
//    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
        System.out.println("Class Person: set surname");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Class Person: set age");
    }

    public void call() {
        System.out.println("Hello, my " + pet.getClass().getSimpleName().toLowerCase() + "!");
        pet.say();
    }
}
