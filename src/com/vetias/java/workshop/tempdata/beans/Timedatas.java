package src.com.vetias.java.workshop.tempdata.beans;

import java.time.LocalTime;

public class Timedatas {
    public static void main(String[] args) {
        LocalTime currenTime=LocalTime.now();
        LocalTime registratioEndTime=LocalTime.of(18,59,59);
        int lefthour=registratioEndTime.getHour()-currenTime.getHour();
        int leftminute=registratioEndTime.getMinute()-currenTime.getMinute();
        int leftsecond=registratioEndTime.getSecond()-currenTime.getSecond();
        System.out.println("your hour:"+lefthour+ "your minute:"+leftminute+ "your second:"+leftsecond +"left to registration");
    }    
}
;