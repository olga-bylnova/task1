package task;

import task.entity.parameter.Color;
import task.entity.parameter.Type;

public class Ball {
    private int size;
    private Type type;
    private Color color;

    public Type getType() {
        return type;
    }

    public Ball(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "task.Ball{" +
                "size=" + size +
                ", type=" + type +
                ", color=" + color +
                '}';
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
