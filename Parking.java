package parking;

import java.util.ArrayList;

public class Parking {

    private String type;
    private int capacity;
    private ArrayList<Car> data;

    public Parking(String newType, int newCapacity) {
        this.type = newType;
        this.capacity = newCapacity;
        this.data = new ArrayList<>();
    }

    public void add(Car car) {
        if (data.size() < capacity) {
            this.data.add(car);
        }
    }

    public boolean remove(String manufacturer, String model) {
        for (Car currCar : data) {
            if (currCar.getManufacturer().equals(manufacturer) && currCar.getModel().equals(model)) {
                this.data.remove(currCar);
                return true;
            }
        }
        return false;
    }

    public Car getLatestCar() {
        Car toReturn = null;
        int year = 0;
        for (Car currCar : data) {
            if (currCar.getYear() > year) {
                year = currCar.getYear();
                toReturn = currCar;
            }
        }
        return toReturn;
    }

    public Car getCar(String manufacturer, String model)  {
        Car toReturn = null;
        for (Car currCar : data) {
            if (currCar.getManufacturer().equals(manufacturer)
                    && currCar.getModel().equals(model)) {
                toReturn = currCar;
            }
        }
        return toReturn;
    }

    public int getCount() {
        return this.data.size();
    }

    public String getStatistics() {
        StringBuilder result = new StringBuilder();
        String name = this.type;
        result.append("The cars are parked in ").append(name).append(":");
        for (Car currCar : data) {
            String manufact = currCar.getManufacturer();
            String model = currCar.getModel();
            int year = currCar.getYear();
            result.append(System.lineSeparator());
            result.append(manufact).append(" ").append(model).append(" ").append("(").append(year).append(")");
        }
        return result.toString();
    }

}
