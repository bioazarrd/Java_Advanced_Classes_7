package parking;
public class Car {

    private String manufacturer;
    private String model;
    private int year;

    public Car(String newManufacturer, String newModel, int newYear) {
        this.manufacturer = newManufacturer;
        this.model = newModel;
        this.year = newYear;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
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

    @Override
    public String toString() {
        return String.format("%s %s (%d)", this.manufacturer, this.model, this.year);
    }
}