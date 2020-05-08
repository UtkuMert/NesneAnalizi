
package uygulama;


import java.util.Scanner;

public class MerkeziBirim {
   
    private AgArayuzu agArayuzu;
    private Subscriber subscriber;
    private Publisher p;
    private KullanıcıVeriTabanı kontrol;
    private KullaniciDogrulama kisi;
    public MerkeziBirim()
    {
       
       
        agArayuzu=new AgArayuzu();
        subscriber=new Subscriber();
        p = new Publisher();
        kontrol=new KullanıcıVeriTabanı();
        kisi=null;
        
    }

    public void start(){
        
        System.out.print("Kullanıcı adinizi giriniz.:");
        Scanner input=new Scanner(System.in);
        String id=input.nextLine();
       
        System.out.print("Şifrenizi giriniz.:");
        Scanner deger=new Scanner(System.in);
        int dgr=deger.nextInt();
        
        
        kisi=kontrol.Search(id, dgr);
//        p.attach(subscriber);
//        subscriber.update("aaa");
        
        if(kisi!=null)
        {  
            
            islemSecimi();
        }
        
        else
            System.out.println("HATALI GIRIS");
    }
    
    public void islemSecimi(){
            int secim=0;
            int secim2=0;
            while (secim != 3) {
            Scanner girdi = new Scanner(System.in);
            System.out.println("1- Cihazi Ac");
            System.out.println("2- Cikis:");
            System.out.print("Lütfen seçiniz:");
            secim = girdi.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Cihaz acildi..");
                    LogYoneticisi.getInstance("Log.txt").dosyayaYaz("Cihaz acildi..");
                    
                    while(secim2!=4){
                    System.out.println("1- Sicakligi göster");
                    System.out.println("2- Sogutucuyu ac");
                    System.out.println("3- Sogutucuyu kapat:");
                    System.out.println("4- Cihazi kapat:");
                    System.out.print("Lütfen seçiniz:");
                    
                    secim2 = girdi.nextInt();
                    
                    switch(secim2){
                        case 1:
                            agArayuzu.sicaklikOkuyucu();
                            break;
                        case 2:
                            agArayuzu.sogutucuyuAc();
                            break;
                        case 3:
                            agArayuzu.sogutucuyuKapat();
                            System.out.println("Sogutucu kapatildi.");
                            break;
                        case 4:
                             System.out.println("Cihaz kapatildi.");
                             break;
                        }
                    }
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("Hatali seçim yaptınız.");
                    break;
            }
        }
    }
    
}
