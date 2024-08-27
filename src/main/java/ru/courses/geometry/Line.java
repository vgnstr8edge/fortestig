package ru.courses.geometry;

import ru.courses.main.Measurable;

import java.util.Objects;

public class Line implements Cloneable {
    Point start;
    Point end;


    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "ru.courses.geometry.Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return start.equals(line.start) && end.equals(line.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Point cloneStart = (Point) start.clone();
        Point cloneEnd = (Point) end.clone();
        return new Line(cloneStart, cloneEnd);
    }


    public double getLength(){
        int catx = end.x - start.x;
        int caty = end.y - start.y;
        return Math.sqrt(catx * catx + caty * caty);
    }


}






    /*
    @Override
    public String toString() {
        return "Линия от {" + x1 +
                ";" + y1 + "} до {" + x2 +
                ";" + y2 + "} имеет длину: " + getLenth(x1, y1, x2, y2);
    }

     */

