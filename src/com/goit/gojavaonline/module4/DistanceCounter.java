package com.goit.gojavaonline.module4;


public class DistanceCounter {

    public static double calcDistance(Position firstPosition, Position secondPosition){
        double distance = Math.sqrt((Math.pow((secondPosition.getPosX()-firstPosition.getPosX()),2)
                + Math.pow((secondPosition.getPosY() - firstPosition.getPosY()),2)));
        return distance;
    }
}
