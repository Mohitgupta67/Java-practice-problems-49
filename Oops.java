abstract class Animal {
    abstract void walk();

    Animal() {
        System.out.println("you are creating a new Animal");
    }

    public void eat() {
        System.out.println("Animal eats");
    }

}

class Horse extends Animal {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }

    Horse() {
        System.out.println("Created a horse");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on two legs");
    }
}

public class Oops {
    public static void main(String args[]) {
        Horse horse = new Horse();

    }
}