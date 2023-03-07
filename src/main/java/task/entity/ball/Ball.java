package task.entity.ball;

import task.entity.parameter.Color;
import task.entity.parameter.Type;

public abstract class Ball {
    protected int diameter;
    protected int weight;
    protected Type type;
    protected Color color;

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
