package module;

public class SHAPE {
    private POINT[] points;

    public SHAPE(POINT[] points) {
        this.points = points;
    }
    public double perimeter() {
        double totalDistance = 0;
        int length = points.length;
        totalDistance += points[length - 1].distanceTo(points[0]);
        for (int i = 0; i < length - 1; i++) {
            totalDistance += points[i].distanceTo(points[i + 1]);
        }

        return totalDistance;
    }

    public double longestSide() {
        double maxDistance = 0;
        int length = points.length;

        for (int i = 0; i < length - 1; i++) {
            double distance = points[i].distanceTo(points[i + 1]);
            maxDistance = Math.max(maxDistance, distance);
        }

        return maxDistance;
    }

    public double averageSide() {
        int length = points.length;
        double total = perimeter();
        return total / length;
    }
}