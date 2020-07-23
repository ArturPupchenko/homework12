package ua.com.alevel.nix.homework12.util;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxDurationBetweenListLocalDateTime {


// 2. Дан список дат (LocalDateTime).
//    Найти наибольшее расстояние (Duration) между двумя датами.


    public static Duration calculateDuration(List<LocalDateTime> listOfDateTime) {


        List<LocalDateTime> sortedlistOfDateTime = listOfDateTime.stream().sorted().collect(Collectors.toList());

        LocalDateTime min = sortedlistOfDateTime.stream()
                .min(Comparator.comparing(LocalDateTime::toLocalDate))
                .get();
        System.out.println("Самая ранняя дата:" + min);

        LocalDateTime max = sortedlistOfDateTime.stream()
                .max(Comparator.comparing(LocalDateTime::toLocalDate))
                .get();
        System.out.println("Самая поздняя дата:" + max);
        return Duration.between(min, max);
    }
}

