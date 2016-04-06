package com.goit.gojavaonline.module4;


public class Start {

    public static void main(String[] args) {
        Position first = new Position(2.5, 3.2);
        Position second = new Position(1.7,5.6);

        DistanceCounter distanceCounter = new DistanceCounter();
        double distance = distanceCounter.calcDistance(first, second);
        System.out.println(distance);
    }
}
