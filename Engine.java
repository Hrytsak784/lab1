public class Engine {
    String type;

    public Engine(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println("Запуск двигуна типу " + type);
    }

    public int getHorsepower() {
        if (type.equals("бензиновий")) {
            return 180;
        } else if (type.equals("дизельний")) {
            return 200;
        } else {
            return 350;
        }
    }
}
