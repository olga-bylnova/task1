package com.innowise.task1.entity.comparator;

import com.innowise.task1.entity.ball.Ball;

public class BallComparatorWeightAsc implements BallComparator {
    @Override
    public int compare(Ball o1, Ball o2) {
        return o1.getWeight().compareTo(o2.getWeight());
    }
}