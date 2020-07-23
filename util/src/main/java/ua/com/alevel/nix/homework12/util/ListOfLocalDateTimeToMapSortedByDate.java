package ua.com.alevel.nix.homework12.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ListOfLocalDateTimeToMapSortedByDate {

//    1. Для списка объектов типа LocalDateTime вернуть ассоциативный массив (Map) LocalDate -> Set<LocalTime>,
//    сгруппировав дату/время по дате. Записи в map отсортировать по порядку дат.


    public static Map<LocalDate, Set<LocalTime>> convertToMap(List<LocalDateTime> listOfDateTime) {

        Map<LocalDate, Set<LocalTime>> map = listOfDateTime.stream()
                .collect(Collectors.groupingBy(LocalDateTime::toLocalDate,
                        TreeMap::new,
                        Collectors.mapping(LocalDateTime::toLocalTime, Collectors.toSet())));
        return map;
    }
}
