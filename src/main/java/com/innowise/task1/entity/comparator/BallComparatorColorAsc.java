package com.innowise.task1.entity.comparator;

import com.innowise.task1.entity.ball.Ball;

import java.util.Comparator;

public class BallComparatorColorAsc implements Comparator<Ball> {
    @Override
    public int compare(Ball o1, Ball o2) {
        return o1.getColor().getPriority()
                .compareTo(o2.getColor().getPriority());
    }
}
