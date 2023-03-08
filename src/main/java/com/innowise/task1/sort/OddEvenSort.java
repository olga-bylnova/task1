package com.innowise.task1.sort;

import com.innowise.task1.entity.ball.Ball;
import com.innowise.task1.entity.comparator.BallComparator;

import java.util.List;

public class OddEvenSort implements BallsSortAlgorithm {
    private BallComparator comparator;

    public void setComparator(BallComparator comparator) {
        this.comparator = comparator;
    }

    public void sort(List<Ball> balls) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = 1; i <= balls.size() - 2; i += 2) {
                if (comparator.compare(balls.get(i), balls.get(i + 1)) > 0) {
                    swapElements(balls, i, i + 1);
                    isSorted = false;
                }
            }

            for (int i = 0; i <= balls.size() - 2; i += 2) {
                if (comparator.compare(balls.get(i), balls.get(i + 1)) > 0) {
                    swapElements(balls, i, i + 1);
                    isSorted = false;
                }
            }
        }
    }

    private void swapElements(List<Ball> balls, int startIndex, int endIndex) {
        Ball temp;
        temp = balls.get(startIndex);
        balls.set(startIndex, balls.get(endIndex));
        balls.set(endIndex, temp);
    }
}
