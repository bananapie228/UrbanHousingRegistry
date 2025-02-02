import java.util.Scanner;

public class UrbanHousingRegistry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        City city = new City("Astana");

        Building building1 = new Building("Abay Avenue", 12, 10.5);
        Building building2 = new Building("Satpayev Street", 25, 12.0);

        city.addBuilding(building1);
        city.addBuilding(building2);

        Room room1 = new Room(101, 25.0, building1);
        Room room2 = new Room(102, 30.0, building1);
        Room room3 = new Room(201, 40.0, building2);

        building1.addRoom(room1);
        building1.addRoom(room2);
        building2.addRoom(room3);

        while (true) {
            System.out.println("\n=== City Management Menu ===");
            System.out.println("1. Add Building");
            System.out.println("2. Remove Building");
            System.out.println("3. Search for Building");
            System.out.println("4. Show All Buildings");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter street name: ");
                String streetName = scanner.nextLine();
                System.out.print("Enter house number: ");
                int houseNumber = scanner.nextInt();
                System.out.print("Enter monthly payment per sq.m: ");
                double payment = scanner.nextDouble();
                scanner.nextLine();

                city.addBuilding(new Building(streetName, houseNumber, payment));
                System.out.println("Building added: " + streetName + " " + houseNumber);

            } else if (choice == 2) {
                System.out.print("Enter street name to remove: ");
                String streetName = scanner.nextLine();
                System.out.print("Enter house number: ");
                int houseNumber = scanner.nextInt();
                scanner.nextLine();

                city.removeBuilding(streetName, houseNumber);

            } else if (choice == 3) {
                System.out.print("Enter street name: ");
                String streetName = scanner.nextLine();
                System.out.print("Enter house number: ");
                int houseNumber = scanner.nextInt();
                scanner.nextLine();

                Building foundBuilding = city.searchBuilding(streetName, houseNumber);
                if (foundBuilding != null) {
                    System.out.println("\nFound Building: " + foundBuilding);
                    for (Room room : foundBuilding.getRooms()) {
                        System.out.println("  - " + room);
                    }
                } else {
                    System.out.println("\nBuilding not found.");
                }

            } else if (choice == 4) {
                city.displayBuildings();

            } else if (choice == 5) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice, Try again");
            }
        }

        scanner.close();
    }
}
