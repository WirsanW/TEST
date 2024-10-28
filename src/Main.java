/**
 * Kelas utama untuk menjalankan aplikasi yang mendemonstrasikan penggunaan kelas Garage dan Vehicle.
 */
public class Main {
/**
 * Metode utama untuk menjalankan program.
 */
 public static void main(String[] args) {

        Garage garage = new Garage("Garasi Utama");


        Vehicle vehicle1 = new Vehicle("Toyota", "Camry", 2020);
        Vehicle vehicle2 = new Vehicle("Honda", "Civic", 2019);
        Vehicle vehicle3 = new Vehicle("Ford", "Mustang", 2021);

        garage.addVehicle(vehicle1);
        garage.addVehicle(vehicle2);
        garage.addVehicle(vehicle3);


        garage.showVehicles();
    }
}
