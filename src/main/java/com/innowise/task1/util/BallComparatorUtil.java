package com.innowise.task1.util;

import com.innowise.task1.entity.ball.Ball;
import com.innowise.task1.entity.comparator.BallComparatorType;
import com.innowise.task1.sort.BallsSortAlgorithm;
import com.innowise.task1.sort.SortAlgorithmType;

import java.util.List;

public class BallComparatorUtil {
    public static void sort(List<Ball> balls, SortAlgorithmType algorithmType,
                                  BallComparatorType comparatorType) {
        BallsSortAlgorithm sortAlgorithm = algorithmType.getSortAlgorithm();
        sortAlgorithm.setComparator(comparatorType.getComparator());
        sortAlgorithm.sort(balls);
    }
}
