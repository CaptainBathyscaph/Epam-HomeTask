package HomeTaskOOP;

public class CarSale {
    public static void main(String[] args) {
        CarClassC volkswagenGolf = new CarClassC("Volkswagen", "Golf VIII", 2009, 2500);
        CarClassC skodaOctavia = new CarClassC("Škoda", "Octavia 5E ", 2015, 1500);
        CarClassE mercedesW213 = new CarClassE("Mercedes-Benz", "W213", 2013, 30000);
        CarClassE audiA6 = new CarClassE("Audi", "A6", 2018, 15000);
        CarClassJ bmwX5 = new CarClassJ("BMW", "X5", 2015, 50000);
        CarClassJ mercedesG65AMG = new CarClassJ("Mercedes-Benz", "G 65 AMG", 2019, 70000);

        Shop shop = new Shop();
        shop.addCar(volkswagenGolf);
        shop.addCar(skodaOctavia);
        shop.addCar(mercedesW213);
        shop.addCar(audiA6);
        shop.addCar(bmwX5);
        shop.addCar(mercedesG65AMG);


        shop.printCoast();
        System.out.println();
        shop.carSale(volkswagenGolf);
        System.out.println();
        shop.printCars();
    }
}
