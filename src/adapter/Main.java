package adapter;

public class Main {
    public static void main(String[] args) {
        LegacyLogger legacyLogger = new LegacyLogger();
        Logger logger = new LegacyLoggerAdapter(legacyLogger);
        Application app = new Application(logger);

        app.run();
    }
}
