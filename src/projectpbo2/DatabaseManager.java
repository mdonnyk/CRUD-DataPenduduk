/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectpbo2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class DatabaseManager {
    public Connection getConnection(){
       String host = "localhost";
       String port = "1521";
       String db = "xe";
       String usr = "HR";
       String pwd = "12345";
              try{
           Class.forName("oracle.jdbc.driver.OracleDriver");}
       catch (ClassNotFoundException ex){
           System.out.println("Maaf driver class tidak ditemukan");
           System.out.println(ex.getMessage());}
              Connection conn = null;
       try{
           conn = DriverManager.getConnection("jdbc:oracle:thin:@"+host+":"+port+":"+db, usr, pwd);
       }
       catch (SQLException ex){
           System.out.println("Maaf koneksi tidak berhasil");
           System.out.println(ex.getMessage());
       }
       
       if (conn!=null) {
           System.out.println("Koneksi ke database terbentuk");
       }
       else{
           System.out.println("Koneksi gagal terbentuk");
       }
       return conn;
   }
   
   public Penduduk showData(String search){
       Penduduk p = new Penduduk();
       Connection conn = null;
       Statement st = null;
       ResultSet rs = null;
       conn = this.getConnection();   
       try{
           st = conn.createStatement();
           rs = st.executeQuery("SELECT * FROM penduduk WHERE nik = "+search);
           
           while(rs.next()){
               p = new Penduduk();
               p.setNIK(rs.getString(1));
               p.setNama(rs.getString(2));
               p.setJenisKelamin(rs.getString(3));
               p.setTempatLahir(rs.getString(4));
               p.setTanggalLahir(rs.getString(5));
               p.setAlamat(rs.getString(6));
               p.setStatus(rs.getString(7));
               p.setAgama(rs.getString(8));
               p.setTelepon(rs.getString(9));
               p.setEmail(rs.getString(10));
               p.setPekerjaan(rs.getString(11));
               p.setKeterangan(rs.getString(12));
           }}
              catch (SQLException ex){
           System.out.println(ex.getMessage());}
       finally{
           try{
               rs.close();
               st.close();
               conn.close();}
                      catch (SQLException ex){
               System.out.println(ex.getMessage());
           }}
       return p;}
   
   
   public String inputData(Penduduk p) throws Exception{
       String text = null;
       Connection conn = null;
       PreparedStatement ps = null;
       
       conn = this.getConnection();
       
       String nik = p.getNIK();
       String nama = p.getNama();
       String jenisKelamin = p.getJenisKelamin();
       String tempat = p.getTempatLahir();
       String tanggal = p.getTanggalLahir();
       String alamat = p.getAlamat();
       String status = p.getStatus();
       String agama = p.getAgama();
       String telpon = p.getTelepon();
       String email = p.getEmail();
       String pekerjaan = p.getPekerjaan();
       String keterangan = p.getKeterangan();
       try{
           ps = conn.prepareCall("INSERT INTO penduduk VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
           ps.setString(1, nik);
           ps.setString(2, nama);
           ps.setString(3, jenisKelamin);
           ps.setString(4, tempat);
           ps.setString(5, tanggal);
           ps.setString(6, alamat);
           ps.setString(7, status);
           ps.setString(8, agama);
           ps.setString(9, telpon);
           ps.setString(10, email);
           ps.setString(11, pekerjaan);
           ps.setString(12, keterangan);
           ps.executeUpdate();
           
           conn.commit();
           text = "Data sudah ditambahkan";}
       catch(SQLException ex){
           throw new Exception(ex.getMessage());}
       finally{
           try{
               ps.close();
               conn.close();}
           catch (SQLException ex){
               throw new Exception(ex.getMessage());
           }}
       return text;
   }

   public String hapusData(String nik){
       String output = null;
       Connection conn = null;
       PreparedStatement ps = null;
       
       conn = this.getConnection();
                   
       try{
           ps = conn.prepareStatement("DELETE FROM penduduk WHERE nik = ?");
           ps.setString(1, nik);
           ps.executeUpdate();
           conn.commit();
           output = "Data sudah dihapus";
       }
       catch (SQLException ex){
           output = ex.getMessage();
       }
       finally{
           try{
               ps.close();
               conn.close();
           }
           catch (SQLException ex){
               output = ex.getMessage();
           }
       }
       
       return output;
   }
   
 
   
   
   public String updateData(Penduduk p) throws Exception{
       String text = null;
       Connection conn = null;
       PreparedStatement ps = null;
       
       conn = this.getConnection();
       
       String nik = p.getNIK();
       String nama = p.getNama();
       String jenisKelamin = p.getJenisKelamin();
       String tempat = p.getTempatLahir();
       String tanggal = p.getTanggalLahir();
       String alamat = p.getAlamat();
       String status = p.getStatus();
       String agama = p.getAgama();
       String telpon = p.getTelepon();
       String email = p.getEmail();
       String pekerjaan = p.getPekerjaan();
       String keterangan = p.getKeterangan();
       
       try{
           ps = conn.prepareCall("UPDATE penduduk SET nama = ?, jenis_kelamin = ? ,"
                   + "tempat_lahir = ? , tanggal_lahir = ? ,"
                   + "alamat = ? , status_perkawinan = ? , "
                   + "agama = ? , nomor_telpon = ? ,"
                   + "email = ? , pekerjaan = ? ,"
                   + "keterangan = ? WHERE nik = ?");
           ps.setString(1, nama);
           ps.setString(2, jenisKelamin);
           ps.setString(3, tempat);
           ps.setString(4, tanggal);
           ps.setString(5, alamat);
           ps.setString(6, status);
           ps.setString(7, agama);
           ps.setString(8, telpon);
           ps.setString(9, email);
           ps.setString(10, pekerjaan);
           ps.setString(11, keterangan);
           ps.setString(12, nik);
           ps.executeUpdate();
           conn.commit();
           text = "Data sudah ditambahkan";
       }
       catch(SQLException ex){
           throw new Exception(ex.getMessage());
           
       }
       finally{
           try{
               ps.close();
               conn.close();
           }
           catch (SQLException ex){
               throw new Exception(ex.getMessage());
           }
       }
       return text;    
   }
   
   public Penduduk[] selectData(){
       Connection conn = null;
       Statement st = null;
       ResultSet rs = null;
       conn = this.getConnection();
       Penduduk p[] = null;
       try{
           st = conn.createStatement();
           rs = st.executeQuery("SELECT count(nik) FROM penduduk");
           rs.next();
           System.out.println(rs.getInt(1));
           p = new Penduduk[rs.getInt(1)];
           rs = st.executeQuery("SELECT * FROM penduduk");
           int index =0;
           while(rs.next()){
               p[index] = new Penduduk();
               p[index].setNIK(rs.getString(1));
               p[index].setNama(rs.getString(2));
               p[index].setJenisKelamin(rs.getString(3));
               p[index].setTempatLahir(rs.getString(4));
               p[index].setTanggalLahir(rs.getString(5));
               p[index].setAlamat(rs.getString(6));
               p[index].setStatus(rs.getString(7));
               p[index].setAgama(rs.getString(8));
               p[index].setTelepon(rs.getString(9));
               p[index].setEmail(rs.getString(10));
               p[index].setPekerjaan(rs.getString(11));
               p[index].setKeterangan(rs.getString(12));
               
               index++;               
           }
       }
       catch (SQLException ex){
           System.out.println(ex.getMessage());
           
       }
       finally{
           try{
               rs.close();
               st.close();
               conn.close();
           }
           catch (SQLException ex){
               System.out.println(ex.getMessage());
           }
       }
   return p;
   }
   
   public Penduduk[] selectData(String column, String search){
       Connection conn = null;
       Statement st = null;
       ResultSet rs = null;
       conn = this.getConnection();
       Penduduk p[] = null;
       try{
           st = conn.createStatement();
           rs = st.executeQuery("SELECT count(nik) FROM penduduk WHERE "+column+" = '"+search+"'");
           rs.next();
           System.out.println(rs.getInt(1));
           p = new Penduduk[rs.getInt(1)];
           
           rs = st.executeQuery("SELECT * FROM penduduk WHERE "+column+" = '"+search+"'");
           int index =0;
           while(rs.next()){
               p[index] = new Penduduk();
               p[index].setNIK(rs.getString(1));
               p[index].setNama(rs.getString(2));
               p[index].setJenisKelamin(rs.getString(3));
               p[index].setTempatLahir(rs.getString(4));
               p[index].setTanggalLahir(rs.getString(5));
               p[index].setAlamat(rs.getString(6));
               p[index].setStatus(rs.getString(7));
               p[index].setAgama(rs.getString(8));
               p[index].setTelepon(rs.getString(9));
               p[index].setEmail(rs.getString(10));
               p[index].setPekerjaan(rs.getString(11));
               p[index].setKeterangan(rs.getString(12));
               
               index++;               
           }
       }
       catch (SQLException ex){
           System.out.println(ex.getMessage());
           
       }
       finally{
           try{
               rs.close();
               st.close();
               conn.close();
           }
           catch (SQLException ex){
               System.out.println(ex.getMessage());
           }
       }
   return p;
   }
   
   
}
