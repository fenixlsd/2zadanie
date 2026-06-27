public class Main {
    public static void main(String[] args) {
        CarDealership dealership = new CarDealership();

        System.out.println("Добавление машин:");

        System.out.println(dealership.addCar(
                new Car("VIN001", "Camry", "Toyota", 2020, 40000, 2500000, CarType.SEDAN)
        ));

        System.out.println(dealership.addCar(
                new Car("VIN002", "X5", "BMW", 2022, 30000, 6000000, CarType.SUV)
        ));

        System.out.println(dealership.addCar(
                new Car("VIN003", "Model S", "Tesla", 2023, 15000, 7500000, CarType.ELECTRIC)
        ));

        System.out.println(dealership.addCar(
                new Car("VIN004", "RAV4", "Toyota", 2021, 35000, 3800000, CarType.SUV)
        ));

        System.out.println(dealership.addCar(
                new Car("VIN005", "Rio", "Kia", 2018, 90000, 1300000, CarType.SEDAN)
        ));

        System.out.println("\nПопытка добавить дубликат по VIN:");
        boolean duplicateResult = dealership.addCar(
                new Car("VIN001", "Corolla", "Toyota", 2024, 10000, 3000000, CarType.SEDAN)
        );
        System.out.println("Дубликат добавлен: " + duplicateResult);

        System.out.println("\nМашины производителя Toyota:");
        dealership.findCarsByManufacturer("Toyota")
                .forEach(System.out::println);

        System.out.println("\nСредняя цена машин типа SUV:");
        double averageSuvPrice = dealership.getAveragePriceByType(CarType.SUV);
        System.out.println(averageSuvPrice);

        System.out.println("\nСредняя цена машин типа ELECTRIC:");
        double averageElectricPrice = dealership.getAveragePriceByType(CarType.ELECTRIC);
        System.out.println(averageElectricPrice);

        System.out.println("\nМашины, отсортированные по году выпуска от новых к старым:");
        dealership.getCarsSortedByYearDesc()
                .forEach(System.out::println);
    }
}
