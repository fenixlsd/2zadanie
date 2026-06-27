import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarDealership {
    private List<Car> cars;

    public CarDealership() {
        this.cars = new ArrayList<>();
    }

    public boolean addCar(Car car) {
        if (car == null) {
            return false;
        }

        boolean duplicateExists = cars.stream()
                .anyMatch(existingCar -> existingCar.getVin().equals(car.getVin()));

        if (duplicateExists) {
            return false;
        }

        cars.add(car);
        return true;
    }

    public List<Car> findCarsByManufacturer(String manufacturer) {
        return cars.stream()
                .filter(car -> car.getManufacturer().equalsIgnoreCase(manufacturer))
                .collect(Collectors.toList());
    }

    public double getAveragePriceByType(CarType type) {
        return cars.stream()
                .filter(car -> car.getType() == type)
                .mapToInt(Car::getPrice)
                .average()
                .orElse(0);
    }

    public List<Car> getCarsSortedByYearDesc() {
        return cars.stream()
                .sorted(Comparator.comparingInt(Car::getYear).reversed())
                .collect(Collectors.toList());
    }
}
