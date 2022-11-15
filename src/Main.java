public class Main {
    public static void main(String[] args) {
        Car car = new Car("Honda", 120, 10000);
        Car car1 = new Car("Ferrari", 340, 12000);
        Car car2 = new Car("Hyundai", 160, 8000);
        Car car3 = new Car("BMW", 250, 15000);

        car.zavod();
        car1.zavod();
        car2.zavod();
        car3.zavod();
    }
}
