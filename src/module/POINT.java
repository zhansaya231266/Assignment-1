package module;

public class POINT {
    private double x;
    private double y;
    public POINT(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(POINT otherPoint) {
        return Math.sqrt(Math.pow(this.x - otherPoint.x, 2) + Math.pow(this.y - otherPoint.y, 2));
    }
}
