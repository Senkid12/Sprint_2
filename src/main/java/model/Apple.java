package model;

import static model.constants.Colour.RED_COLOR;
import static model.constants.Discount.DISCOUNT_FOR_RED_APPLE;
import static model.constants.Discount.DISCOUNT_FOR_ALL_GOODS;

public class Apple extends Food {
    String colour;

    public Apple(int amount, float price, String colour) {
        // Добавил вызов конструктора суперкласса с 3-им параметром
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public float getDiscount() {
        if (colour.equals(RED_COLOR)) {
            return DISCOUNT_FOR_RED_APPLE;
        }
        return DISCOUNT_FOR_ALL_GOODS;
    }
}
