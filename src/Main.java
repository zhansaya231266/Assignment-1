import module.POINT;
import module.SHAPE;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\User\\IdeaProjects\\project _1\\src\\coordinates");

        Scanner sc = new Scanner(file);

        POINT[] pointsArray = new POINT[10];

        int index = 0;
        while (sc.hasNext() && index<10) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            pointsArray[index] = new POINT(x, y);
            index++;
        }
        SHAPE shape = new SHAPE(pointsArray);

        System.out.println(shape.perimeter());
        System.out.println(shape.longestSide());
    }
}