/**
 * Created by jackbrashier on 4/18/17.
 */
public class CarDriver {
    public static void main(String [] args) {

        Car myCar = new Car();
        Car hisCar = new Car("Black", "Honda", 400, 3.5);
        Car herCar = new Car("Pink", "Volkswagon", 300, 2.5);

        System.out.println(myCar);
        System.out.println(hisCar);
        System.out.println(herCar);

        //Begin changing characteristics of existing cars.
        myCar.setColor("Blue");
        hisCar.setColor("Blue");
        herCar.setColor("Blue");

        myCar.setMake("Ferrari");
        hisCar.setMake("Ferrari");
        herCar.setMake("Ferrari");

        myCar.setHorsepower(650);
        hisCar.setHorsepower(650);
        herCar.setHorsepower(650);

        myCar.setEngineSize(6.5);
        hisCar.setEngineSize(6.5);
        herCar.setEngineSize(6.5);
        //End characteristic changing

        System.out.println("\n(All cars have been changed to Blue Ferraris with 650HP and 6.5 Engine Size)");
        System.out.println("myCar: " + myCar.getColor() + " " + myCar.getHorsepower() + " " +  myCar.getEngineSize() + " " + myCar.getMake());
        System.out.println("hisCar: " + hisCar.getColor() + " " + hisCar.getHorsepower() + " " +  hisCar.getEngineSize() + " " + hisCar.getMake());
        System.out.println("herCar: " + herCar.getColor() + " " + herCar.getHorsepower() + " " +  herCar.getEngineSize() + " " + herCar.getMake());
    }
}
