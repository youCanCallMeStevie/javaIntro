package src;
public class ClassesAndObjects {
    public static void main(String[] args) {
        // Dog obj1 = new Dog();
        // obj1.bark();
        // obj1.walk();
        Dog obj2 = new Dog("Labrodor", "white");
        Dog obj3 = new Dog("Collie", "brown");

    }
}

class Dog
{
    String breed;
    String colour;

    Dog(String b, String c)
    {
        breed = b;
        colour = c;
    }
    
    void bark()
    {
        System.out.println("Barks");

    }
    void walk ()
    {
        System.out.println("Walks");
    }
}
