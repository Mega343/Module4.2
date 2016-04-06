package com.goit.gojavaonline.module4.test;


import com.goit.gojavaonline.module4.DistanceCounter;
import com.goit.gojavaonline.module4.Position;

import junit.framework.Assert;
import org.junit.Test;

public class DistanceCounterTest {

    @Test(timeout = 1000)
    public void testCalcDistance() throws Exception {

        final double x1 = 5.5;
        final double y1 = 2.2;
        final double x2 = 0.7;
        final double y2 = 4.6;

        Position position1 = new Position(x1, y1);
        Position position2 = new Position(x2, y2);

        DistanceCounter counter = new DistanceCounter();

        final double result = counter.calcDistance(position1, position2);

        final double waitingResult= Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1, 2));
        Assert.assertEquals(waitingResult, result);

    }
}