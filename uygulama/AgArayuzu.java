/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uygulama;

public class AgArayuzu {
    
    private SicaklikAlgilayicisi deneme;
    private ISicaklikOku sicaklikOku;
    private IEyleyici eyleyici;
    
    private ISubject publisher;
    private Subscriber subscriber;
    
    private int deger;
    private int sayi;
    
    
    public AgArayuzu(){

        eyleyici = new Eyleyici();
        deneme = new SicaklikAlgilayicisi();
        //sicaklikOku=new SicaklikOkuKelvin();
        sicaklikOku=new SicaklikOkuCelsius();
        
          
        publisher=new Publisher();
        subscriber=new Subscriber();
        publisher.attach(subscriber);
                
    }
    
    public void sicaklikOkuyucu(){
        deger=deneme.sicaklikOkuma(sicaklikOku);
        
        if(deger>60)
           publisher.notify("SICAKLIK COK YUKSEK");
           
    }
    
   public void sogutucuyuAc(){
       
        if(deger<60)
           sayi = eyleyici.sogutucuyuAc(deger);
        else
           sayi = eyleyici.ekstraSogutucu(deger);
           
        
        System.out.println("Sogutucu calisiyor...");
        LogYoneticisi.getInstance("Log.txt").dosyayaYaz("Sogutucu calisiyor...");
        
        System.out.println("Guncel sicakliginiz "+sayi);
        LogYoneticisi.getInstance("Log.txt").dosyayaYaz("Guncel sicakliginiz "+sayi);
        
       
    }
    public void sogutucuyuKapat(){
        
        System.out.println("Sogutucu kapatiliyor...");
        LogYoneticisi.getInstance("Log.txt").dosyayaYaz("Sogutucu kapatiliyor...");
        
    }
}
