package com.innowise.task1.entity.comparator;

public enum BallComparatorType {
    COLOR_ASC(new BallComparatorColorAsc()),
    COLOR_DESC(new BallComparatorColorDesc()),
    DIAMETER_ASC(new BallComparatorDiameterAsc()),
    DIAMETER_DESC(new BallComparatorDiameterDesc()),
    TYPE_ASC(new BallComparatorTypeAsc()),
    TYPE_DESC(new BallComparatorTypeDesc()),
    WEIGHT_ASC(new BallComparatorWeightAsc()),
    WEIGHT_DESC(new BallComparatorWeightDesc());

    private BallComparator comparator;
    BallComparatorType(BallComparator comparator) {
        this.comparator = comparator;
    }
    public BallComparator getComparator() {
        return comparator;
    }
}
