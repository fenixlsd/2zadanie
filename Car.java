import java.util.Objects;

public class Car implements Comparable<Car> {
    private String vin;
    private String model;
    private String manufacturer;
    private int year;
    private int mileage;
    private int price;
    private CarType type;

    public Car(String vin, String model, String manufacturer, int year, int mileage, int price, CarType type) {
        this.vin = vin;
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
        this.type = type;
    }

    public String getVin() {
        return vin;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public int getPrice() {
        return price;
    }

    public CarType getType() {
        return type;
    }

    @Override
    public int compareTo(Car other) {
        return Integer.compare(other.year, this.year);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Car)) {
            return false;
        }

        Car car = (Car) obj;
        return Objects.equals(vin, car.vin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin);
    }

    @Override
    public String toString() {
        return manufacturer + " " + model +
                ", VIN: " + vin +
                ", год: " + year +
                ", пробег: " + mileage +
                ", цена: " + price +
                ", тип: " + type;
    }
}
