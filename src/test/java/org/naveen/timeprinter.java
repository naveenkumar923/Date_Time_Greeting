package org.naveen;

import java.time.LocalDateTime;

public class timeprinter {


    public static void main(String[] args){
        LocalDateTime currentTime=LocalDateTime.now();

        System.out.println(currentTime);
        System.out.println(currentTime.getHour());
        System.out.println(currentTime.getDayOfWeek());

    }


}
