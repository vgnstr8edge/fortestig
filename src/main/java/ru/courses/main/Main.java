package ru.courses.main;


import ru.courses.otherTests.Sauce;
import ru.courses.otherTests.Spiciness;

public class Main {
    public static void main(String[] arg) {
        Sauce sauce1 = new Sauce("Чили", Spiciness.VERYSPICY);
        Sauce sauce2 = new Sauce("Барбекю", Spiciness.NOTSPICY);
        System.out.println(sauce1);
        System.out.println(sauce2);



    }

}


















/*
package ru.courses.main;
import ru.courses.geometry.Point;


public class Main {
    public static void main(String[] arg) {
        Point a = new Point(1,2);
        java.awt.Point b = new java.awt.Point(3,4);

    }

}

========================================================

package ru.courses.main;
import static ru.courses.math.Degree.pow;

public class Main {
    public static void main(String[] args) {

        double result = pow(args[0], args[1]);
        System.out.println(result);

    }

}


=-=====================================

package ru.courses.main;
import static ru.courses.math.Degree.pow;

public class Main {
    public static void main(String[] args) {

        double result = pow(args[0], args[1]);
        System.out.println(result);

    }

}




=================================================
import ru.courses.geometry.Fraction2;

public class Main {
    public static void main(String[] arg) {
        Fraction2 f1 = new Fraction2(1,3);
        Fraction2 f2 = new Fraction2(2,5);
        Fraction2 f3 = new Fraction2(7,8);



        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);


        Fraction2 result =  f1.sumFraction(f2).sumFraction(f3).minusNumber(5);
        System.out.println(result.toString());

    }

}





=====================================================================================================
import java.util.Arrays;

public class ru.courses.main.Main {
    public static void main(String[] arg) {
        ru.courses.geometry.Line one = new ru.courses.geometry.Line(new ru.courses.geometry.Point(1, 5), new ru.courses.geometry.Point(2, 8));
        ru.courses.geometry.Line two = new ru.courses.geometry.Line(new ru.courses.geometry.Point(5, 3), new ru.courses.geometry.Point(8, 9));


        //Создать Ломаную, проходящую через точки {1;5}, {2;8}, {5;3}, {8,9}
        ru.courses.geometry.Point[][] polyLine = {{one.start, one.end}, {two.start, two.end}};
        System.out.print("Ломаная, проходящая через точки: ");
        System.out.println(Arrays.deepToString(polyLine));
        System.out.println();

        //Рассчитать длину Ломаной
        double sumOfLenth = one.getLenth() + two.getLenth();
        String finalSum = String.format("%.2f", sumOfLenth);
        System.out.println("Длина Ломаной: "+finalSum);
        System.out.println();

        double sumOfLenthArrs = one.getLenth() + two.getLenth();


        //Сравнить длину Ломаной и массива Линий: они должны совпасть
        System.out.print("Сравнение длины Ломаной и массива Линий: ");
        System.out.println(sumOfLenth == sumOfLenthArrs);
        System.out.println();

        //Получить у Ломаной массив Линий
        ru.courses.geometry.Point[] newArrLines = new ru.courses.geometry.Point[polyLine.length * polyLine[0].length];
        int index = 0;
        for (int i = 0; i < polyLine.length; i++) {
            for (int j = 0; j < polyLine[i].length; j++) {
                newArrLines[index++] = polyLine[i][j];
            }
        }
        System.out.print("Получение у ломаной массива Линий: ");
        System.out.println(Arrays.toString(newArrLines));
        System.out.println();


        //Рассчитать длину массива Линий
        int polyLineLenth = polyLine[0].length + polyLine[1].length;
        System.out.println("Длина массива Линий: "+polyLineLenth);
        System.out.println();


        //Изменить координаты Точки {2,8} таким образом, чтобы она стала иметь значение {12,8}.
        one.end.x = 12;
        for (ru.courses.geometry.Point[] points : polyLine) {
            System.out.print("Изменение координат Точки {2,8}: ");
            System.out.println(Arrays.toString(points));
        }

    }

}

==========================================================================================
public class ru.courses.main.Main {
    public static void main(String[] arg) {

        ru.courses.geometry.Line one = new ru.courses.geometry.Line(new ru.courses.geometry.Point(1, 3), new ru.courses.geometry.Point(5, 8));
        ru.courses.geometry.Line two = new ru.courses.geometry.Line(new ru.courses.geometry.Point(10, 11), new ru.courses.geometry.Point(15, 19));
        ru.courses.geometry.Line three = new ru.courses.geometry.Line(one.end, two.start);

        System.out.println(three);

        three.end = new ru.courses.geometry.Point(6, 9);
        three.start = new ru.courses.geometry.Point(11, 12);

        System.out.println(three);

        double sumOfLenth = one.getLenth()+ two.getLenth()+ three.getLenth();
        String finalSum = String.format("%.2f", sumOfLenth);
        System.out.println(finalSum);

    }

}
==========================================================================================
public class ru.courses.main.Main {
    public static void main(String[] arg) {
        ru.courses.geometry.Point a = new ru.courses.geometry.Point(1, 3);
        ru.courses.geometry.Point b = new ru.courses.geometry.Point(1, 3);
        ru.courses.geometry.Point c = new ru.courses.geometry.Point(5, 8);


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println("Результат сравнения точек a, b, c: " + ru.courses.geometry.Point.compare(a, b, c));

    }

}
*/