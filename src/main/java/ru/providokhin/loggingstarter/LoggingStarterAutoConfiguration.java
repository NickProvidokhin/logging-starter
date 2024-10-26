package ru.providokhin.loggingstarter;

public class LoggingStarterAutoConfiguration {
    public static void println(String str) {
        System.out.println("Вызвано из gradle библиотеки: " + str);
    }
}
