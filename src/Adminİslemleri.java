
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Adminİslemleri {
    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    public ArrayList<Employee> calisanlariGetir(){
        ArrayList<Employee> cikti = new ArrayList<Employee>();
        
        try {
            statement = con.createStatement();
            String sorgu = "Select *From employee";
            
            ResultSet rs = statement.executeQuery(sorgu);
            while(rs.next()){
                int id = rs.getInt("ID");
                String ad = rs.getString("Name");
                String soyisim = rs.getString("Surname");
                int yas = rs.getInt("Age");
                String medeniHali = rs.getString("MarialStatus");
                String meslek = rs.getString("Job");
                int maas = rs.getInt("Salary");
                int numara = rs.getInt("PhoneNumber");
                String mail = rs.getString("Email");
                
                cikti.add(new Employee(id,ad,soyisim,yas,medeniHali,meslek,maas,numara,mail));
            }
            
            return cikti;
            
        } catch (SQLException ex) {
            Logger.getLogger(Adminİslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }
    
    
    
    
    
    
    
    
    public void calisanSil(int id){
        String sorgu = "Delete from employee  where id = ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
             preparedStatement.setInt(1, id);
             
             preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Adminİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
       ;
    }
    
    
    public void calisanGuncelle(int id,String yeniAd,String yeniSoyad,String yeniyas,String yeniMedeni,String yeniMeslek,String yeniMaas,String yeniTelefon,String yeniEmail){
        String sorgu = "Update employee set Name = ?,Surname = ?,Age = ?,MarialStatus = ?,Job = ?,Salary = ?,PhoneNumber = ?,Email = ? where id = ?";
        
        try {
                preparedStatement = con.prepareStatement(sorgu);
                
                preparedStatement.setString(1, yeniAd);
                preparedStatement.setString(2, yeniSoyad);
                preparedStatement.setString(3, yeniyas);
                preparedStatement.setString(4, yeniMedeni);
                preparedStatement.setString(5, yeniMeslek);
                preparedStatement.setString(6, yeniMaas);
                preparedStatement.setString(7, yeniTelefon);
                preparedStatement.setString(8, yeniEmail);
                preparedStatement.setInt(9, id);
                
                preparedStatement.executeUpdate();
                
                
            } catch (SQLException ex) {
                Logger.getLogger(Adminİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public void calisanEkle(String ad,String soyad,String yas,String medeni,String meslek,String maas,String telefon,String email){
        String sorgu = "Insert Into employee(Name,Surname,Age,MarialStatus,Job,Salary,PhoneNumber,Email)VALUES(?,?,?,?,?,?,?,?)";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, yas);
            preparedStatement.setString(4, medeni);
            preparedStatement.setString(5, meslek);
            preparedStatement.setString(6, maas);
            preparedStatement.setString(7, telefon);
            preparedStatement.setString(8, email);
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Adminİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void yoneticiEkle(String ad,String soyad,String username,String password,String telefon,String email){
        String sorgu = "Insert Into admin(Name,Surname,Username,Password,PhoneNumber,Email)VALUES(?,?,?,?,?,?)";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, username);
            preparedStatement.setString(4, password);
            preparedStatement.setString(5, telefon);
            preparedStatement.setString(6, email);
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Adminİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    public boolean girisYap(String kullanici_adi,String parola){
        String sorgu = "Select * From admin where  Username = ? and Password = ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, kullanici_adi);
            preparedStatement.setString(2, parola);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(Adminİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
    }
    
    public boolean adminKontrol(String kullanici_adi){
        String sorgu = "Select * From admin where  Username = ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, kullanici_adi);
            
            
            ResultSet rs = preparedStatement.executeQuery();
            
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(Adminİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    
    public Adminİslemleri(){
        
        String url = "jdbc:mysql://"+ AdminDatabase.host + ":" + AdminDatabase.port + "/" + AdminDatabase.db_ismi;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı....");
        }
        try {
            con = DriverManager.getConnection(url, AdminDatabase.kullanici_adi, AdminDatabase.parola);
            System.out.println("Bağlantı Başarılı");
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız");
        }
    }
    
    public static void main(String[] args) {
        Adminİslemleri islemler = new Adminİslemleri();
    }
      
}
