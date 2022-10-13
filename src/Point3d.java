public class Point3d { // Объявление класса
    public double getxCoord() { // Получить координату Х точки
        return xCoord;
    }

    public void setxCoord(double xCoord) { // Задать координату Х точке
        this.xCoord = xCoord;
    }

    public double getyCoord() { // Получить координату Y точки
        return yCoord;
    }

    public void setyCoord(double yCoord) { // Задать координату Y точке
        this.yCoord = yCoord;
    }

    public double getzCoord() { // Получить координату Z точки
        return zCoord;
    }

    public void setzCoord(double zCoord) { // Задать координату Z точке
        this.zCoord = zCoord;
    }

    private double xCoord;
    private double yCoord;
    private double zCoord;

    public Point3d(double xCoord, double yCoord, double zCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.zCoord = zCoord;
    }

    public double distanceTo(Point3d point){ // Посчитать расстояние до другой точки
        return Math.round(Math.sqrt(
                Math.pow(point.getxCoord() - getxCoord(), 2) +
                        Math.pow(point.getyCoord() - getyCoord(), 2) +
                        Math.pow(point.getzCoord() - getzCoord(), 2)
        )*100.0)/100.0;
    }

    public boolean comparePoints(Point3d point){ // Сравнить точки (совпадают или нет)
        if((getxCoord()==point.getxCoord()&&getyCoord()==point.getyCoord()&&getzCoord()==point.getzCoord())){
            return false;
        }
        return true;
    }
}
