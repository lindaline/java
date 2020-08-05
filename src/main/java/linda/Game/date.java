package linda.Game;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class date {
    public static void main(String[] args) {
       java();
       java2();
    }

    private static void java2() {
        Instant instant=Instant.now();
        System.out.println(instant);
        LocalDateTime now=LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatter.format(now));
        System.out.println(now.plus(Duration.ofHours(3)));
        LocalDateTime other=LocalDateTime.of(2020,8,1,16,13,0);
        System.out.println(other);
    }

    private static void java() {
        Date date=new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(date));
        String s="2020/7/31 08:00:00";
        Date other=null;
        try{
            other=sdf.parse(s);
            System.out.println(other);
        }catch(ParseException e){
            e.printStackTrace();
        }
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(calendar.MONTH,9);
        System.out.println(calendar.getTime());
        calendar.add(calendar.DAY_OF_YEAR,3);
        System.out.println(calendar.getTime());
    }
}

