public class LogLevels {
    
    public static String message(String logLine) {
        String message = logLine.split("]:")[1].trim();     
        return message;
    }

    public static String logLevel(String logLine) {
        String level = logLine.split("\\[")[1].split("\\]")[0].toLowerCase();
        return level;
    }

    public static String reformat(String logLine) {
        String message = message(logLine);
        String level = logLevel(logLine);
        return message + " (" + level + ")";
    }
}
