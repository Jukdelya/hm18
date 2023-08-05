package second;

public class Main2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = dog;
        Dog dog2 = (Dog) animal;
        dog2.bark();
    }
}