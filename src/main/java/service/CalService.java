package service;

import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.GregorianCalendar;

@Service
public class CalService {
    public int score(String name){
        /*
         * 加入设置日期，每天的人品值都不同
         */
        Calendar nowtime = new GregorianCalendar();
        int asc=(name+nowtime.get(Calendar.DATE)).hashCode();
        asc=(asc-623)/2+1;
        if(asc<0){
            asc=-asc;
        }
        return asc%101;
    }

}
