
package uygulama;

public class Subscriber implements IObserver {
    
    public void update(String mesaj) {
        System.out.println("UYARI!!->" + mesaj);
    }
    
}
