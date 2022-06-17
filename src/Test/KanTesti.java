/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author asli
 */
public class KanTesti extends LabTest {
    LocalDateTime localDate = LocalDateTime.now();
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 
    private String id, isim, dogumTarihi;
    private String formatDate = localDate.format(format);
    
        
    public KanTesti(String a, String b, String c) {
         isim = a;
         id = b;
         dogumTarihi = c;
    }
     
     

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return isim;
    }

    @Override
    public String getTime() {
        return formatDate;
    }
    
    
}
