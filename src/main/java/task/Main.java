package task;

import task.Ball;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ball> balls = new ArrayList<>();
        balls.add(new Ball(2));
        balls.add(new Ball(6));
        balls.add(new Ball(1));
        balls.add(new Ball(4));

        new Service().sort(balls);
        for (Ball ball : balls) {
            System.out.println(ball);
        }
    }
}
