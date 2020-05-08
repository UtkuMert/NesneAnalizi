
package uygulama;

public class SicaklikOkuKelvin implements ISicaklikOku {
    
    
    @Override
    public int sicaklikOku(SicaklikAlgilayicisi deger){
        int sayi=deger.rastgeleSicaklik()+273;
        System.out.println("Sicaklik hesaplaniyor..");
        LogYoneticisi.getInstance("Log.txt").dosyayaYaz("Sicaklik hesaplaniyor..");
        String str1 = "Su anki sicakliginiz "+Integer.toString(sayi)+" Kelvin"; 
        System.out.println(str1);
        LogYoneticisi.getInstance("Log.txt").dosyayaYaz(str1);
        return sayi;
    }
    
}
