package ru.geekbrains.oop06.logger;

public class LoggerFactory {

    public static Logger create() {
        return new LoggerImpl();
    }
}
