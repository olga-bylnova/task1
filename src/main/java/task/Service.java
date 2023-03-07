package task;

import task.Ball;

import java.util.Comparator;
import java.util.List;

public class Service {
    Comparator<Ball> comparator = (o1, o2) -> Integer.compare(o1.getSize(), o2.getSize());

    public void sort(List<Ball> balls) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            Ball temp;

            for (int i = 1; i <= balls.size() - 2; i = i + 2) {
                if (comparator.compare(balls.get(i), balls.get(i + 1)) > 0) {
                    temp = balls.get(i);
                    balls.set(i, balls.get(i + 1));
                    balls.set(i + 1, temp);
                    isSorted = false;
                }
            }

            for (int i = 0; i <= balls.size() - 2; i = i + 2) {
                if (comparator.compare(balls.get(i), balls.get(i + 1)) > 0) {
                    temp = balls.get(i);
                    balls.set(i, balls.get(i + 1));
                    balls.set(i + 1, temp);
                    isSorted = false;
                }
            }
        }
    }
}
