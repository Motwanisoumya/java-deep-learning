package week1.designpatterns;

interface Animal {
    void speak();
}

class Dog implements Animal {
    public void speak() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    public void speak() {
        System.out.println("Meow!");
    }
}

class AnimalFactory {
    public static Animal createAnimal(String type) {
        if ("dog".equalsIgnoreCase(type)) return new Dog();
        else if ("cat".equalsIgnoreCase(type)) return new Cat();
        else return null;
    }
}

public class FactoryMethod {
    public static void main(String[] args) {
        Animal a1 = AnimalFactory.createAnimal("dog");
        Animal a2 = AnimalFactory.createAnimal("cat");

        a1.speak();  // Woof!
        a2.speak();  // Meow!
    }
}
