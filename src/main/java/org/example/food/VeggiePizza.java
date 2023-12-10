package org.example.food;
import org.example.food.Pizza;
public class VeggiePizza implements Pizza {
    @Override
    public String prepare() {
        return "Veggie Pizza";
    }
}
