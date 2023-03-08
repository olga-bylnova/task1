package com.innowise.task1.entity.comparator;

import com.innowise.task1.entity.ball.Ball;

import java.util.Comparator;

public class BallComparatorDiameterDesc implements BallComparator {
    @Override
    public int compare(Ball o1, Ball o2) {
        return o2.getDiameter().compareTo(o1.getDiameter());
    }
}
