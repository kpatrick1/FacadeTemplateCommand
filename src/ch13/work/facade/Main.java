package ch13.work.facade;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = {
                new RectangleAdapter(new Rectangle()),
                new LineAdapter(new Line()),
                new CircleAdapter(new Circle()),
                new SquareAdapter((new Square()))
        };

        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
        for (Shape shape : shapes) {
            shape.draw(x1, y1, x2, y2);
        }


    }
}

