package homework1;

import org.springframework.beans.factory.annotation.Value;

//@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

//    @Autowired
//    public Person(@Qualifier("catBean") Pet pet) {
//        System.out.println("Person bean has been created");
//        this.pet = pet;
//    }

    public Person(Pet pet) {
        System.out.println("Person bean has been created");
        this.pet = pet;
    }

//    public Person() {
//        System.out.println("Person bean has been created");
//    }

//    @Autowired
//    @Qualifier("dogBean")
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Hello, my pet!");
        pet.say();
    }
}
