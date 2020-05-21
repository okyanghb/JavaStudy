package chapter4;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.toString());

        Date deadline = null;
        System.out.println(deadline);

        //LocalDate，获取日期。
        LocalDate ld = LocalDate.of(1986,7,6);
        System.out.println(LocalDate.now());
        System.out.println(ld);
        System.out.println(ld.getYear()+"-"+ld.getMonthValue()+"-"+ld.getDayOfMonth());

        LocalDate lds = ld.plusDays(1000);
        int year = lds.getYear();
        int month = lds.getMonthValue();
        int days = lds.getDayOfMonth();
        System.out.println(year + "-" + month +"-" + days);

        System.out.println("=====");
        GregorianCalendar someDay= new GregorianCalendar(1986,7,6);
        int years = someDay.get(Calendar.YEAR);
        int months = someDay.get(Calendar.MONTH);
        int dayss = someDay.get(Calendar.DAY_OF_MONTH);
        System.out.println(years + "-" + months +"-" + dayss);

        someDay.add(Calendar.DAY_OF_MONTH,1000);
        years = someDay.get(Calendar.YEAR);
        months = someDay.get(Calendar.MONTH);
        dayss = someDay.get(Calendar.DAY_OF_MONTH)-1;
        System.out.println(years + "-" + months +"-" + dayss);
    }
}
