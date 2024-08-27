package ru.courses.geometry;

public class ClosedPolyLine extends PolyLine {

    public ClosedPolyLine(Point[] points) {
        super(points);
    }


    @Override
    public double getLenght() {
        double fullLength = super.getLength();
        double lastLine = Math.sqrt(
                Math.pow(points[0].x - points[points.length - 1].x, 2) +
                        Math.pow(points[0].y - points[points.length - 1].y, 2)
        );

        return fullLength + lastLine;

    }

}
