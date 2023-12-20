package service;
import model.Food;

public class ShoppingCart {
    private Food[] foods;
    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public float getTotalPriceWithoutDiscouint() {
        float price = 0;
        for (int i = 0; i < foods.length; i++) {
            price += foods[i].getPrice() * foods[i].getAmount();
        }
        return price;
    }

    public float getTotalPriceWithDiscoint() {
        float price = 0;
        for (int i = 0; i < foods.length; i++) {
            price += (foods[i].getPrice() - sumDiscount(foods[i])) * foods[i].getAmount();
        }
        return price;
    }

    public float getTotalAllVegetarianWithoutDiscount() {
        float price = 0;
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].isVegetarian()) {
                price += foods[i].getPrice() * foods[i].getAmount();
            }
        }
        return price;
    }
    private float sumDiscount(Food food) {
        return food.getPrice() / 100 * food.getDiscount();
    }
}
