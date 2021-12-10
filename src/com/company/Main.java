package com.company;

import com.company.taxi.Cars;
import com.company.taxi.Drivers;
import com.company.taxi.Routs;
import com.company.taxi.Taxi;

public class Main {

    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Cars cars = new Cars();
        cars.setModel("Mercedes");
        cars.setColor("Red");
        cars.setNumberOfSeats(4);
        cars.setNumber("CE4671BT");

        Drivers drivers = new Drivers();
        drivers.setName("Lera");
        drivers.setExperience(2);
        drivers.setYear(20);

        taxi.getRouts().add(
                new Routs.RoutsBuilder()
                        .setCar(cars)
                        .setDriver(drivers)
                        .setAddress("Chernivtsi")
                        .setSum_routs(4000)
                        .build()
        );

        System.out.println(taxi.toString());
    }
}
