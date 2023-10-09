public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry");
        Engine engine1 = new Engine("бензиновий");
        Car car2 = new Car("Mercedes", "GLS");
        Engine engine2 = new Engine("дизельний");
        Car car3 = new Car("BMW", "M5");
        Engine engine3 = new Engine("гібридний");

        car1.startEngine();
        System.out.println(car1.getInfo());
        int horsepower1 = engine1.getHorsepower();
        System.out.println("Потужність двигуна: " + horsepower1 + " к.с.");
        car1.drive(120);
        System.out.println();

        System.out.println(car2.getInfo());
        engine2.start();
        int horsepower2 = engine2.getHorsepower();
        System.out.println("Потужність двигуна: " + horsepower2 + " к.с.");
        car3.drive(60);
        System.out.println();

        System.out.println(car3.getInfo());
        car3.startEngine();
        int horsepower = engine3.getHorsepower();
        System.out.println("Потужність двигуна: " + horsepower + " к.с.");
        car3.drive(80);
    }
}