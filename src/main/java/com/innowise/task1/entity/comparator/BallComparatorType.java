package com.innowise.task1.entity.comparator;

import com.innowise.task1.entity.ball.Ball;

import java.util.Comparator;

public enum BallComparatorType {
    COLOR_ASC(new BallComparatorColorAsc()),
    COLOR_DESC(new BallComparatorColorAsc().reversed()),
    DIAMETER_ASC(new BallComparatorDiameterAsc()),
    DIAMETER_DESC(new BallComparatorDiameterAsc().reversed()),
    TYPE_ASC(new BallComparatorTypeAsc()),
    TYPE_DESC(new BallComparatorTypeAsc().reversed()),
    WEIGHT_ASC(new BallComparatorWeightAsc()),
    WEIGHT_DESC(new BallComparatorWeightAsc().reversed());

    private final Comparator<Ball> comparator;
    BallComparatorType(Comparator<Ball> comparator) {
        this.comparator = comparator;
    }
    public Comparator<Ball> getComparator() {
        return comparator;
    }
}
