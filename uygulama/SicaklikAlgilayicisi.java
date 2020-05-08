
package uygulama;

import java.util.Random;

public class SicaklikAlgilayicisi{
   
    public int rastgeleSicaklik(){
        Random rand = new Random();
        int sayi=rand.nextInt(100);
        return sayi;
    }
    
    public int sicaklikOkuma(ISicaklikOku sicaklik)
    {
        return sicaklik.sicaklikOku(this);
    }
    
//    public int sicaklikDegeri(int deger){
//        if(deger<60)
//    }
}
