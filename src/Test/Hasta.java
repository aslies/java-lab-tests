/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author asli
 */
public class Hasta {
    private String isim, telNo, id;
    private Date birthdate;
    LocalDate localDate;
    Period diff;
    private int yas;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Calendar calendar = Calendar.getInstance();
    
    
    public Hasta(String a, String b, String c, String d) throws ParseException {
        isim = a;
        id = b;
        birthdate = sdf.parse(c);
        calendar.setTime(birthdate);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int date = calendar.get(Calendar.DATE);
        localDate = LocalDate.of(year, month, date);
        LocalDate now = LocalDate.now();
        diff = Period.between(localDate, now);
        
        yas = diff.getYears();
        telNo = d;
        
    }
    public String getName() {
        return isim;
    }
    
    public int getAge() {
    
        return yas;
    }
    
    public String getNumber() {
        return telNo;
    }
    
    public String getId() {
        return id;
    }
}
