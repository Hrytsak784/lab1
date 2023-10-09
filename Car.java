public class Car {
     String producer;
    String model;

    public Car(String make, String model) {
        this.producer = make;
        this.model = model;
    }

    public String getInfo() {
        return "Автомобіль " + producer + " " + model;
    }

    public void startEngine() {
        System.out.println("Запуск двигуна автомобіля " + producer + " " + model);
    }


    public void drive(int distance) {
        System.out.println(producer + " " + model + " поїхав " + distance + " км.");
    }
}
