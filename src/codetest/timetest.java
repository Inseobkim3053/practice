package codetest;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class timetest {

    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = formatter.format(zonedDateTime);
        System.out.println(format);

    }
}
