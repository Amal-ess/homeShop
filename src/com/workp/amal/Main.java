package com.workp.amal;

import com.workp.amal.garage.Car;
import java.util.List;
public class Main {

    public static void main(String[] args) {
	Car car = new Car ("Clio III",
            "Renault Clio 3 Gris année 2005", "Renault", 2005, "Gris",
    225, new int[]{4832, 1720, 1497}, 1240, 5, 5, "motor name",
            List.of(new String[]{"vitres éléctriques", "GPS"}));
    }
}
