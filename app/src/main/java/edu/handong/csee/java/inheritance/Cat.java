package edu.handong.csee.java.inheritance;

public class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat; // polymorphism
        Animal.testClassMethod(); // hiding
        // result : The static method in Animal
        myAnimal.testInstanceMethod(); // override
        // result : The instance method in Cat
        
        
       
        Animal dog = new Dog(); // polymorphism
        Animal.testClassMethod(); // hiding
        // result : The static method in Animal
        
        dog.testInstanceMethod(); // override
        // result : The instance method in Dog
        
        Animal monkey = new Monkey(); // polymorphism
        Animal.testClassMethod(); // hiding
        // result : The static method in Animal
        monkey.testInstanceMethod(); // override
        // result : The instance method in Monkey
        
        
    }
}

