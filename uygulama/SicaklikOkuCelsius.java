
package uygulama;

public class SicaklikOkuCelsius implements ISicaklikOku {
    
    
    @Override
    public int sicaklikOku(SicaklikAlgilayicisi deger){
       
        int sayi=deger.rastgeleSicaklik();
        System.out.println("Sicaklik hesaplaniyor..");
        LogYoneticisi.getInstance("Log.txt").dosyayaYaz("Sicaklik hesaplaniyor..");
        String str1 = "Su anki sicakliginiz "+Integer.toString(sayi)+" °C"; 
        System.out.println(str1);
        LogYoneticisi.getInstance("Log.txt").dosyayaYaz(str1);
       
        return sayi;
    }
    
}
