package org.example.food;
import org.example.food.Pizza;
public class PepperoniPizza implements Pizza {
    @Override
    public String prepare() {
        return "Pepperoni pizza";
    }
}
