package ch13.work.facade;

public class CircleAdapter implements Shape {
    private Circle adaptee;

    public CircleAdapter(Circle circle) {
        this.adaptee = circle;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        int rad = (x2 - x1)*2 + (y2 - y1)*2;
        int x = Math.min(x1, x2);
        int y = Math.min(y1, y2);


        adaptee.draw(x, y, rad);
    }
}
