package com.jyami.commitersewha.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by jyami on 2020/11/12
 */
public class TimeUtils {

    public static LocalDateTime getStartDate(LocalDate localDate) {
        return localDate.atStartOfDay();
    }

    public static LocalDateTime getStartDate(String localDate) {
        LocalDate date = LocalDate.parse(localDate, DateTimeFormatter.ISO_DATE);
        return LocalDateTime.of(date, LocalTime.MIN);
    }

    public static LocalDateTime getEndDate(LocalDate localDate) {
        return localDate.atTime(23, 59, 59);
    }

    public static LocalDateTime getTodayEndTime() {
        return getEndDate(LocalDate.now());
    }
}
