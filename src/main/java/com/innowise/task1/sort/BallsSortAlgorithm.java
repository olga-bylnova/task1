package com.innowise.task1.sort;

import com.innowise.task1.entity.ball.Ball;

import java.util.Comparator;
import java.util.List;

public interface BallsSortAlgorithm {
    void setComparator(Comparator<Ball> comparator);
    void sort(List<Ball> balls);
}
