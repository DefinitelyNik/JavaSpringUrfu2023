package homework1;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Pet{
    public Cat() {
        System.out.println("Cat bean has been created");
    }

    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
