public class Point2d {
    public double getxCoord() {
        return xCoord;
    }

    public double getyCoord() {
        return yCoord;
    }

    public void setxCoord(double xCoord) {
        this.xCoord = xCoord;
    }

    public void setyCoord(double yCoord) {
        this.yCoord = yCoord;
    }

    public double xCoord;
    public double yCoord;

    public Point2d(double xCoord, double yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }
}
