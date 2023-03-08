package com.innowise.task1.entity.parameter;

public enum Type {
    FOOTBALL(1),
    BASKETBALL(2),
    VOLLEYBALL(3);

    private Integer priority;

    Type(Integer priority) {
        this.priority = priority;
    }

    public Integer getPriority() {
        return priority;
    }
}
