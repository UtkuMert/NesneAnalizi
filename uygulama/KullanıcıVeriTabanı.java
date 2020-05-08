
package uygulama;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class KullanıcıVeriTabanı {
    
    private Connection connect(){
    
        Connection conn=null;
        
        try
        {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Kisiler",
                    "postgres", "e.1.2.3.");
            if (conn != null)
                System.out.println("Bilgileriniz kontrol ediliyor...");
            else
                System.out.println("Baglanti girişimi başarisiz!");
             } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
        }
        
    public KullaniciDogrulama Search(String Id,int sifre){
             
            KullaniciDogrulama kontrol=null;
           
            String sql = "SELECT * FROM \"KisilerListesi\" WHERE \"Id\" ='"+Id +"' and \"Sifre\"='"+ sifre +"'";
            Connection conn=this.connect();
            
            try{
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
            
                conn.close();
                
                String id;
                String ad;
                int sfr;
                
                while (rs.next()) {
                    id = rs.getString("Id");
                    ad = rs.getString("Isim");
                    sfr = rs.getInt("Sifre");
                    System.out.println(" Sifreniz dogru");
                    System.out.println(" Hosgeldiniz "+ad);
                    kontrol=new KullaniciDogrulama(id,ad,sfr);

                }
                                
            rs.close();
            stmt.close();
                   
            }catch (Exception e) {
            e.printStackTrace();
            }
            return kontrol;
    }
    
}
