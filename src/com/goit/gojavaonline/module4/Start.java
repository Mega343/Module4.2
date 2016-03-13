package com.goit.gojavaonline.module4;


public class Start {

    public static void main(String[] args) {
        Position first = new Position(5, 3);
        Position second = new Position(2,8);

        DistanceCounter distanceCounter = new DistanceCounter();
        double distance = distanceCounter.calcDistance(first, second);
        System.out.println(distance);
    }
}
