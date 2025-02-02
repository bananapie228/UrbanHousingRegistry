import java.util.ArrayList;
import java.util.List;

public class Building {
    private String streetName;
    private int houseNumber;
    private double monthlyPaymentPerSqM;
    private List<Room> rooms;

    public Building(String streetName, int houseNumber, double monthlyPaymentPerSqM) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.monthlyPaymentPerSqM = monthlyPaymentPerSqM;
        this.rooms = new ArrayList<>();
    }

    public String getStreetName() {
        return streetName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public double getMonthlyPaymentPerSqM() {
        return monthlyPaymentPerSqM;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void removeRoom(Room room) {
        rooms.remove(room);
    }

    public double getTotalArea() {
        double total = 0.0 ;
        for (Room room : rooms) {
            total += room.getArea();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Building at " + streetName + " " + houseNumber + " (Total Area: " + getTotalArea() + " sq.m)";
    }
}
