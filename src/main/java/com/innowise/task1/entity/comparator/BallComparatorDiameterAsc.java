package com.innowise.task1.entity.comparator;

import com.innowise.task1.entity.ball.Ball;

import java.util.Comparator;

public class BallComparatorDiameterAsc implements Comparator<Ball> {
    @Override
    public int compare(Ball o1, Ball o2) {
        return o1.getDiameter().compareTo(o2.getDiameter());
    }
}
