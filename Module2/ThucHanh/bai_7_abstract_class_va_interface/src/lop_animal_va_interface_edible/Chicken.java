package lop_animal_va_interface_edible;

public class Chicken extends Animal implements Edible{
    public Chicken() {
    }

    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "Chicken could be fried!";
    }
}