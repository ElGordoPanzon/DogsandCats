//Dog.java
class Dog {
    public String name;
    private String breed;
    protected int age;
    static String species = "Canine";

    // Parameterized constructor
    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    // Default constructor
    public Dog() {
        this.name = "Unknown";
        this.breed = "Unknown";
        this.age = 0;
    }

    // Public method to get the breed
    public String getBreed() {
        return breed;
    }

    // Protected method to display animal info
    protected void displayAnimalInfo() {
        System.out.println("Dog: Name: " + name + ", Breed: " + breed + ", Age: " + age);
    }

    // Static method to display species
    static void displaySpecies() {
        System.out.println("All dogs are of species: " + species);
    }
}

// Cat.java
class Cat {
    public String name;
    private String color;
    protected int age;
    static String species = "Feline";

    // Parameterized constructor
    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    // Default constructor
    public Cat() {
        this.name = "Unknown";
        this.color = "Unknown";
        this.age = 0;
    }

    // Public method to get the color
    public String getColor() {
        return color;
    }

    // Protected method to display animal info
    protected void displayAnimalInfo() {
        System.out.println("Cat: Name: " + name + ", Color: " + color + ", Age: " + age);
    }

    // Static method to display species
    static void displaySpecies() {
        System.out.println("All cats are of species: " + species);
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        // Create Dog objects
        Dog dog1 = new Dog("Max", "Labrador", 5);
        Dog dog2 = new Dog(); // Default constructor

        // Display Dog info
        dog1.displayAnimalInfo();
        dog2.displayAnimalInfo();

        // Display Dog species
        Dog.displaySpecies();

        // Create Cat objects
        Cat cat1 = new Cat("Whiskers", "Black", 3);
        Cat cat2 = new Cat(); // Default constructor

        // Display Cat info
        cat1.displayAnimalInfo();
        cat2.displayAnimalInfo();

        // Display Cat species
        Cat.displaySpecies();
    }
}