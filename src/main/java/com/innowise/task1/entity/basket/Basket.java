package com.innowise.task1.entity.basket;

import com.innowise.task1.entity.ball.Ball;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final List<Ball> balls;

    public void addBall(Ball ball) {
        balls.add(ball);
    }

    public Basket() {
        this.balls = new ArrayList<>();
    }

    public List<Ball> getBalls() {
        return balls;
    }
}
