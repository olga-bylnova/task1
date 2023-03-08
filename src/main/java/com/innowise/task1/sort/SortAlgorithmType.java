package com.innowise.task1.sort;

import com.innowise.task1.entity.comparator.BallComparator;

public enum SortAlgorithmType {
    ODD_EVEN_SORT(new OddEvenSort());
    private BallsSortAlgorithm sortAlgorithm;
    SortAlgorithmType(BallsSortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }
    public BallsSortAlgorithm getSortAlgorithm() {
        return sortAlgorithm;
    }
}
