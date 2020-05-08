/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uygulama;

public class Eyleyici implements IEyleyici{
    
    @Override
    public int sogutucuyuAc(int sayi){
        
        System.out.println("Sogutucu aciliyor..");
        LogYoneticisi.getInstance("Log.txt").dosyayaYaz("Sogutucu aciliyor..");
        
        return sayi-10;
    }
    
    @Override
    public int ekstraSogutucu(int sayi){
        System.out.println("Sicaklik cok fazla..");
        LogYoneticisi.getInstance("Log.txt").dosyayaYaz("Sicaklik cok fazla..");
        
        
        System.out.println("Ekstra sogutucu aciliyor..");
        LogYoneticisi.getInstance("Log.txt").dosyayaYaz("Ekstra sogutucu aciliyor..");
        
      
        return sayi-30;
    }

    
}
