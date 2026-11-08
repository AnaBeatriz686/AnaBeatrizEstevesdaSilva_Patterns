package adapter;

public class LegacyLoggerAdapter implements Logger{

    private final LegacyLogger legacyLogger;

    public LegacyLoggerAdapter(LegacyLogger legacyLogger) {
        this.legacyLogger = legacyLogger;
    }

    @Override
    public void info(String message) {
        legacyLogger.log("INFO", message);
    }

    @Override
    public void error(String message) {
        legacyLogger.log("ERROR", message);
    }
}
