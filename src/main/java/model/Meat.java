package model;

public class Meat extends Food {
    public Meat(int amount, float price) {
        // Добавил вызов конструктора суперкласса с 3-им параметром
        super(amount, price, false);
    }

    @Override
    public float getDiscount() {
        return super.getDiscount();
    }
}
