package fourth;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args){
        List<Car> listOfCar = new ArrayList<>();
        listOfCar.add(new Car(1));
        listOfCar.add(new Car(122));

        List<Motor> listOfMotors = new ArrayList<>();
        listOfMotors.add(new Motor(2));
        listOfMotors.add(new Motor(3));

        main(listOfCar);
        main(listOfMotors);
    }
    private static void main(List<? extends Car> list){
        for(Car car : list){
            System.out.println(car);
        }
    }
}
