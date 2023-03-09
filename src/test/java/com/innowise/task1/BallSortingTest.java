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
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BallSortingTest {
    private static final List<Ball> balls = new ArrayList<>(List.of(
            new Basketball(1, 2, Type.BASKETBALL, Color.BLUE),
            new Volleyball(7, 55, Type.VOLLEYBALL, Color.GREEN),
            new Football(3, 25, Type.FOOTBALL, Color.RED),
            new Volleyball(2, 12, Type.VOLLEYBALL, Color.BLACK),
            new Basketball(9, 222, Type.BASKETBALL, Color.YELLOW),
            new Volleyball(20, 50, Type.VOLLEYBALL, Color.RED),
            new Basketball(10, 38, Type.BASKETBALL, Color.BLUE),
            new Football(13, 17, Type.FOOTBALL, Color.YELLOW),
            new Volleyball(8, 110, Type.VOLLEYBALL, Color.BLACK),
            new Basketball(18, 25, Type.BASKETBALL, Color.GREEN)
    ));

    @BeforeEach
    public void shuffleList() {
        Collections.shuffle(balls);
    }

    @Test
    @DisplayName(value = "Odd-Even sort by diameter ASC")
    public void testOddEvenSortByDiameterAsc() {
        BallComparatorUtil.sort(balls, SortAlgorithmType.ODD_EVEN_SORT,
                BallComparatorType.DIAMETER_ASC);
        List<Integer> diameterList = balls.stream().map(Ball::getDiameter).toList();
        Assertions.assertTrue(isListSortedAsc(diameterList, diameterList.size()));
    }

    @Test
    @DisplayName(value = "Odd-Even sort by diameter DESC")
    public void testOddEvenSortByDiameterDesc() {
        BallComparatorUtil.sort(balls, SortAlgorithmType.ODD_EVEN_SORT,
                BallComparatorType.DIAMETER_DESC);
        List<Integer> diameterList = balls.stream().map(Ball::getDiameter).toList();
        Assertions.assertTrue(isListSortedDesc(diameterList, diameterList.size()));
    }

    @Test
    @DisplayName(value = "Odd-Even sort by weight ASC")
    public void testOddEvenSortByWeightAsc() {
        BallComparatorUtil.sort(balls, SortAlgorithmType.ODD_EVEN_SORT,
                BallComparatorType.WEIGHT_ASC);
        List<Integer> weightList = balls.stream().map(Ball::getWeight).toList();
        Assertions.assertTrue(isListSortedAsc(weightList, weightList.size()));
    }

    @Test
    @DisplayName(value = "Odd-Even sort by weight DESC")
    public void testOddEvenSortByWeightDesc() {
        BallComparatorUtil.sort(balls, SortAlgorithmType.ODD_EVEN_SORT,
                BallComparatorType.WEIGHT_DESC);
        List<Integer> weightList = balls.stream().map(Ball::getWeight).toList();
        Assertions.assertTrue(isListSortedDesc(weightList, weightList.size()));
    }

    @Test
    @DisplayName(value = "Odd-Even sort by color ASC")
    public void testOddEvenSortByColorAsc() {
        BallComparatorUtil.sort(balls, SortAlgorithmType.ODD_EVEN_SORT,
                BallComparatorType.COLOR_ASC);
        List<Integer> colorPriorityList = balls.stream().map(Ball::getColor)
                .map(Color::getPriority).toList();
        Assertions.assertTrue(isListSortedAsc(colorPriorityList, colorPriorityList.size()));
    }

    @Test
    @DisplayName(value = "Odd-Even sort by color DESC")
    public void testOddEvenSortByColorDesc() {
        BallComparatorUtil.sort(balls, SortAlgorithmType.ODD_EVEN_SORT,
                BallComparatorType.COLOR_DESC);
        List<Integer> colorPriorityList = balls.stream().map(Ball::getColor)
                .map(Color::getPriority).toList();
        Assertions.assertTrue(isListSortedDesc(colorPriorityList, colorPriorityList.size()));
    }

    @Test
    @DisplayName(value = "Odd-Even sort by type ASC")
    public void testOddEvenSortByTypeAsc() {
        BallComparatorUtil.sort(balls, SortAlgorithmType.ODD_EVEN_SORT,
                BallComparatorType.TYPE_ASC);
        List<Integer> typePriorityList = balls.stream().map(Ball::getType)
                .map(Type::getPriority).toList();
        Assertions.assertTrue(isListSortedAsc(typePriorityList, typePriorityList.size()));
    }

    @Test
    @DisplayName(value = "Odd-Even sort by type DESC")
    public void testOddEvenSortByTypeDesc() {
        BallComparatorUtil.sort(balls, SortAlgorithmType.ODD_EVEN_SORT,
                BallComparatorType.TYPE_DESC);
        List<Integer> typePriorityList = balls.stream().map(Ball::getType)
                .map(Type::getPriority).toList();
        Assertions.assertTrue(isListSortedDesc(typePriorityList, typePriorityList.size()));
    }

    private static boolean isListSortedAsc(List<Integer> list, int n) {
        if (n == 1 || n == 0) return true;
        return list.get(n - 2) <= list.get(n - 1) && isListSortedAsc(list, n - 1);
    }
    private static boolean isListSortedDesc(List<Integer> list, int n) {
        if (n == 1 || n == 0) return true;
        return list.get(n - 2) >= list.get(n - 1) && isListSortedDesc(list, n - 1);
    }
}
