package model;

import static model.constants.Discount.DISCOUNT_FOR_ALL_GOODS;

public abstract class Food implements Discountable {
    protected int amount;
    protected float price;
    protected boolean isVegetarian;

    // Использовал конструктор с 3-мя параметрами
    public Food(int amount, float price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    @Override
    public float getDiscount() {
        return DISCOUNT_FOR_ALL_GOODS;
    }
    public int getAmount() {
        return amount;
    }
    public float getPrice() {
        return price;
    }
    public boolean isVegetarian() {
        return isVegetarian;
    }
}
