package homework1;

public class Dog implements Pet{
    @Override
    public void say() {
        System.out.println("Dog bean has been created");
        System.out.println("Bow-Wow");
    }
}
