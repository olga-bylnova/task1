package com.innowise.task1.entity.comparator;

import com.innowise.task1.entity.ball.Ball;

import java.util.Comparator;

public class BallComparatorTypeAsc implements Comparator<Ball> {
    @Override
    public int compare(Ball o1, Ball o2) {
        return o1.getType().getPriority()
                .compareTo(o2.getType().getPriority());
    }
}
