package com.innowise.task1;

import com.innowise.task1.entity.ball.Ball;
import com.innowise.task1.entity.ball.Basketball;
import com.innowise.task1.entity.ball.Football;
import com.innowise.task1.entity.ball.Volleyball;
import com.innowise.task1.entity.comparator.BallComparatorType;
import com.innowise.task1.entity.parameter.Color;
import com.innowise.task1.entity.parameter.Type;
import com.innowise.task1.sort.SortAlgorithmType;
import com.innowise.task1.util.BallComparatorUtil;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ball> balls = new ArrayList<>(List.of(
                new Basketball(1, 2, Type.BASKETBALL, Color.BLUE),
                new Volleyball(7, 100, Type.VOLLEYBALL, Color.GREEN),
                new Football(3, 25, Type.FOOTBALL, Color.RED),
                new Volleyball(2, 12, Type.VOLLEYBALL, Color.BLACK),
                new Basketball(9, 222, Type.BASKETBALL, Color.YELLOW)
        ));
        BallComparatorUtil.sort(balls, SortAlgorithmType.ODD_EVEN_SORT, BallComparatorType.WEIGHT_DESC);
        for (Ball ball : balls) {
            System.out.println(ball.toString());
        }
    }
}
