package chapter4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();//现在的日期
        int month = date.getMonthValue();//月份的数字
        int today = date.getDayOfMonth();//几号，数字表示
        //System.out.println(month+"-"+today);

        date = date.minusDays(today-1);//回到本月头一天  假定今天是10号，第一天是1号，想得到1，就要用10-（10-1），10-1就是day-1
        //System.out.println(date);

        DayOfWeek week = date.getDayOfWeek();//头一天是一周内的第几天
        //System.out.println(week);
        int value = week.getValue();
        //System.out.println(value);

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        //利用所在的日期判断前面需要几个空格，每次4个空格
        for(int i = 1;i<value;i++){
            System.out.print(" ");
        }
        while (date.getMonthValue()==month){
            System.out.printf("%3d",date.getDayOfMonth());
            if(date.getDayOfMonth()==today){
                System.out.print("*");
            }else {
                System.out.print(" ");
            }
            date = date.plusDays(1);//用date遍历+1
            if(date.getDayOfWeek().getValue() == 1) System.out.println();
        }
        if(date.getDayOfWeek().getValue()!=1) System.out.println();
        Date d = new Date();
        System.out.println(d.clone());
    }
}
