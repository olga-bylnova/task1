package com.innowise.task1.entity.comparator;

import com.innowise.task1.entity.ball.Ball;

public class BallComparatorWeightDesc implements BallComparator {
    @Override
    public int compare(Ball o1, Ball o2) {
        return o2.getWeight().compareTo(o1.getWeight());
    }
}
