package pwo.lab10.flyweight;

public class Context {

    private double x;

    private double y;

    public Context(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(final double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(final double y) {
        this.y = y;
    }

    @Override public String toString() {
        return "Context{" +
            "x=" + x +
            ", y=" + y +
            '}';
    }
}
