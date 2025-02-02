public class Room {
    private int number;
    private double area;
    private Building building;

    public Room(int number, double area, Building building) {
        this.number = number;
        this.area = area;
        this.building = building;
    }

    public int getNumber() {
        return number;
    }

    public double getArea() {
        return area;
    }

    public Building getBuilding() {
        return building;
    }

    @Override
    public String toString() {
        return "Room " + number + " (Area: " + area + " sq.m)";
    }
}
