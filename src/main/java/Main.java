import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.GREEN_COLOR;
import static model.constants.Colour.RED_COLOR;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100F);
        Food appleRed = new Apple(10, 50F, RED_COLOR);
        Food appleGreen = new Apple(8, 60F, GREEN_COLOR);

        Food[] foods = {meat, appleRed, appleGreen};

        ShoppingCart shoppingCart = new ShoppingCart(foods);
        System.out.println("Общая сумма товаров без скидки: " + shoppingCart.getTotalPriceWithoutDiscouint());
        System.out.println("Общую сумма товаров со скидкой:" + shoppingCart.getTotalPriceWithDiscoint());
        System.out.println("Сумма всех вегетарианских продуктов без скидки:" + shoppingCart.getTotalAllVegetarianWithoutDiscount());
    }
}
