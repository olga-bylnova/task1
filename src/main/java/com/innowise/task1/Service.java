package com.innowise.task1;

import com.innowise.task1.entity.ball.Ball;
import com.innowise.task1.entity.comparator.BallComparator;

import java.util.Comparator;
import java.util.List;

public class Service {
    Comparator<Ball> comparator = (o1, o2) -> Integer.compare(o1.getDiameter(), o2.getDiameter());


}
