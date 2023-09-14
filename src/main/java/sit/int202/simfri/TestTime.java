package sit.int202.simfri;

import java.util.Date;

public class TestTime {
    public static void main(String[] args) {
        Date d1 = new Date(1000*60);
        Date d2 = new Date(1000*60*60*24);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(System.currentTimeMillis());
        Date toDay = new Date(1694145178916L);
        System.out.println(toDay);
        Date toMorrow = new Date(1694145178916L + (1000*60*60*24));
        System.out.println(toMorrow);
    }
}
