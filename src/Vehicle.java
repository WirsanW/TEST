import java.util.ArrayList;

/**
 * Merepresentasikan sebuah kendaraan dengan informasi dasar seperti merek, model, dan tahun
 */
public class Vehicle implements Info.VehicleInfo {
    private String make;
    private String model;
    private int year;

    /**
     * Membuat objek Vehicle dengan merek, model, dan tahun tertentu
     *
     * @param make  merek kendaraan
     * @param model model kendaraann
     * @param year  tahun kendaraan
     */
    public Vehicle(String make, String model, int year) {
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    /**
     * Menampilkan informasi kendaraan ke konsol
     */
    @Override
    public void displayVehicleInfo() {
        System.out.println("Merek: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Tahun: " + getYear());
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

/**
 * Merepresentasikan garasi yang menyimpan kumpulan kendaraan.
 */
class Garage {
    public ArrayList<Vehicle> vehicles;
    private String location;

    /**
     * Membuat objek Garage dengan lokasi tertentu.
     *
     * @param location Lokasi garasi.
     */
    public Garage(String location) {
        this.setLocation(location);
        this.vehicles = new ArrayList<>();
    }

    /**
     * Menambahkan kendaraan ke dalam garasi.
     *
     * @param vehicle Kendaraan yang akan ditambahkan.
     */
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println(vehicle.getMake() + " " + vehicle.getModel() + " telah ditambahkan ke garasi.");
    }

    /**
     * Menampilkan semua kendaraan yang tersimpan di dalam garasi.
     */
    public void showVehicles() {
        System.out.println("Kendaraan ditempatkan di: " + location);
        for (Vehicle vehicle : vehicles) {
            vehicle.displayVehicleInfo();
            System.out.println("-------------------");
        }
    }

    public void setLocation(String location) {
        this.location = location;
    }
}