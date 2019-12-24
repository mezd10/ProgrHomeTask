package com.poly;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CountDate {
    private int errorCode;
    private int years;

    public CountDate(int errorCode, int year) {
        this.errorCode = errorCode;
        this.years = year;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getDataMessage() {
        return count();
    }

    private String count() {
        StringBuilder sb = new StringBuilder();
        Calendar calendar = new GregorianCalendar(years, Calendar.JANUARY, 0);
        calendar.add(Calendar.DAY_OF_YEAR, 256);
        int day =  calendar.get(Calendar.DATE);
        sb.append(day);
        sb.append("/");
        int month = calendar.get(Calendar.MONTH) + 1;
        sb.append(month);
        sb.append("/");
        sb.append(years);
        return sb.toString();
    }
}
