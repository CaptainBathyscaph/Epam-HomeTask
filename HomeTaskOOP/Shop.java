package HomeTaskOOP;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Cars> shop = new ArrayList<>();


    public void addCar (Cars car)
    {
        shop.add(car);
    }
    public void printCars ()
    {
        for (Cars car: shop
             ) {
            System.out.println(car);
        }
        
    }

    public void printCoast()
    {
        for (Cars car: shop
             ) {
            System.out.println("Model: " + car.getModelName() + " Coast = " + car.getCost() + " $" );

        }
    }

    public void carSale(Cars car)
    {
        System.out.println("Car "+ car.getModelName() + " was sold");
        shop.remove(car);
    }




}
