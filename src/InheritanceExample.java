// Base class
class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Some  animal make a sound");
    }
}

// Derived class (inherits from Animal)
class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Bark bark");
    }

    public void fetch() {
        System.out.println(name + " is fetching the ball.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Unknown", 5);
        genericAnimal.makeSound();

        Dog myDog = new Dog("Buddy", 3);
        myDog.makeSound(); // Calls overridden method
        myDog.fetch(); // Calls subclass-specific method
    }
}
