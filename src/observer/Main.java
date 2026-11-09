package observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        ConsoleDisplay display = new ConsoleDisplay();
        FanController controller = new FanController();

        station.subscribe(display);
        station.subscribe(controller);

        station.setTemperatura(26);
        System.out.println();
        station.setTemperatura(30);
        System.out.println();

        station.unsubscribe(display);
        station.setTemperatura(27);
    }
}
