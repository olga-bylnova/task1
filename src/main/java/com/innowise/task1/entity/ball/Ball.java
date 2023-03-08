package com.innowise.task1.entity.ball;

import com.innowise.task1.entity.parameter.Color;
import com.innowise.task1.entity.parameter.Type;

public abstract class Ball {
    Integer diameter;
    Integer weight;
    Type type;
    Color color;

    public Ball(Integer diameter, Integer weight, Type type, Color color) {
        this.diameter = diameter;
        this.weight = weight;
        this.type = type;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "diameter=" + diameter +
                ", weight=" + weight +
                ", type=" + type +
                ", color=" + color +
                '}';
    }

    public Integer getDiameter() {
        return diameter;
    }

    public void setDiameter(Integer diameter) {
        this.diameter = diameter;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
