package com.innowise.task1.entity.ball;

import com.innowise.task1.entity.parameter.Color;
import com.innowise.task1.entity.parameter.Type;

public abstract class Ball {
    int diameter;
    int weight;
    Type type;
    Color color;

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
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
