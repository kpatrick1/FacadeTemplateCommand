package ch13.work.facade;

public class LineAdapter implements Shape{
    private Line adaptee;

    public LineAdapter(Line line) {
        this.adaptee = line;
    }

    @Override
    public void draw(int x, int y, int z, int j) {
        adaptee.draw(x, y, z, j);
    }
}
