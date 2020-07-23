package ua.com.alevel.nix.homework12.main;

import ua.com.alevel.nix.homework12.util.ListOfLocalDateTimeToMapSortedByDate;
import ua.com.alevel.nix.homework12.util.MaxDurationBetweenListLocalDateTime;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Main {

//    1. Для списка объектов типа LocalDateTime вернуть ассоциативный массив (Map) LocalDate -> Set<LocalTime>,
//    сгруппировав дату/время по дате. Записи в map отсортировать по порядку дат.
// 2. Дан список дат (LocalDateTime).
//    Найти наибольшее расстояние (Duration) между двумя датами.
//
//    Для всех задач рекомендую использовать Stream API.


    public static void main(String[] args) {

        System.out.println("\n--------------------------------------------------------");
        System.out.println("\nЗадание 1\n");
        System.out.println("Для списка объектов типа LocalDateTime\n" +
                "вернуть ассоциативный массив\n" +
                "(Map) LocalDate -> Set<LocalTime>,\n" +
                "сгруппировав дату/время по дате.\n" +
                "Записи в map отсортировать по порядку дат.");

        System.out.println("\nИсходный список LocalDateTime:\n");
        List<LocalDateTime> listOfDateTime = Arrays.asList(
                LocalDateTime.of(1995, 3, 12, 22, 20, 25),
                LocalDateTime.of(1975, 1, 10, 20, 00, 05),
                LocalDateTime.of(1985, 2, 11, 21, 10, 15),
                LocalDateTime.of(2005, 4, 13, 23, 30, 35),
                LocalDateTime.of(2015, 5, 14, 00, 40, 45),
                LocalDateTime.of(2020, 07, 23, 20, 00, 00));
        System.out.println(listOfDateTime);
        System.out.println("\nРезультаты группировки и сортировки:\n");
        System.out.println(ListOfLocalDateTimeToMapSortedByDate.convertToMap(listOfDateTime));

        System.out.println("\n--------------------------------------------------------");

        System.out.println("\nЗадание 2\n");
        System.out.println("Дан список дат (LocalDateTime):\n");
        System.out.println(listOfDateTime);
        System.out.println("\nНайти наибольшее расстояние (Duration) между двумя датами.");
        System.out.println("\nОтвет:\n");
        System.out.println("Duration в секундах: " + MaxDurationBetweenListLocalDateTime.calculateDuration(listOfDateTime).toSeconds());
        System.out.println("\n--------------------------------------------------------");
    }
}

