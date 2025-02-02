import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private List<Building> buildings;

    public City(String name) {
        this.name = name;
        this.buildings = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void addBuilding(Building building) {
        buildings.add(building);
        System.out.println("Building added: " + building);
    }


    public void removeBuilding(String streetName, int houseNumber) {
        Building buildingToRemove = searchBuilding(streetName, houseNumber);
        if (buildingToRemove != null) {
            buildings.remove(buildingToRemove);
            System.out.println("Building removed: " + buildingToRemove);
        } else {
            System.out.println("Building not found, cannot remove.");
        }
    }

    public Building searchBuilding(String streetName, int houseNumber) {
        for (Building building : buildings) {
            if (building.getStreetName().equalsIgnoreCase(streetName) && building.getHouseNumber() == houseNumber) {
                return building;
            }
        }
        System.out.println("⚠ No building found at " + streetName + " " + houseNumber);
        return null;
    }

    public void displayBuildings() {
        if (buildings.isEmpty()) {
            System.out.println("🏙 No buildings in " + name + ".");
        } else {
            System.out.println("\n=== Buildings in " + name + " ===");
            for (Building building : buildings) {
                System.out.println(building);
            }
        }
    }
}
