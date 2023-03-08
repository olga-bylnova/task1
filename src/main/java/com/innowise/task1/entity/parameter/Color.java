package com.innowise.task1.entity.parameter;

public enum Color {
    YELLOW(1),
    BLACK(2),
    BLUE(3),
    GREEN(4),
    RED(5);

    private Integer priority;

    Color(Integer priority) {
        this.priority = priority;
    }

    public Integer getPriority() {
        return priority;
    }
}
