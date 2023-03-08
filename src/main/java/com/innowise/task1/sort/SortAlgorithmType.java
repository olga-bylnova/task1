package com.innowise.task1.sort;

public enum SortAlgorithmType {
    ODD_EVEN_SORT(new OddEvenSort());
    private final BallsSortAlgorithm sortAlgorithm;
    SortAlgorithmType(BallsSortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }
    public BallsSortAlgorithm getSortAlgorithm() {
        return sortAlgorithm;
    }
}
