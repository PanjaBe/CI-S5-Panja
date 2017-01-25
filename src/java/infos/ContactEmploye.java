package infos;

import Connexion.Connexion;
import java.sql.*;
import java.util.ArrayList;
import personne.Personnel;

public class ContactEmploye {
   public long idContactEmploye;
   public java.util.Date modificationContactE;
   public int telephoneEmploye;
   public java.lang.String adresseEmploye;
   public java.lang.String mailEmploye;
   public Personnel personnel;
   
   public Personnel getPersonnel() {
      return personnel;
   }
   
   public ContactEmploye(){}
   
   public ContactEmploye(long idPersonnel,int tel,String addr,String mail)
   {
       personnel=new Personnel(idPersonnel);
       telephoneEmploye=tel;
       adresseEmploye=addr;
       mailEmploye=mail;
   }
   
    public void insert() throws Exception
    {
        Connection conn=null;
        Statement s=null;
        try
        {
            conn=Connexion.getConn();
            int i=Connexion.getLastsequence("contactemploye_idcontactemploye_seq");
            String req = "INSERT INTO contactemploye VALUES("+i+","+personnel.idPersonnel+",'now()',"+telephoneEmploye+",'"+adresseEmploye+"','"+mailEmploye+"')";
            s=conn.createStatement();
            s.executeUpdate(req);
        }
        catch(Exception e){}
        finally
        {
            if(s!=null)
            {
                s.close();
            }
            if(conn!=null)
            {
                conn.close();
            }
        }
       
    }
   
    public static ContactEmploye find(long emp) throws Exception
    {
        Connection conn=null;
        Statement s=null;
        ContactEmploye ret=null;
        try
        {
            String req = "select idcontactemploye as id,telephoneemploye as tel,adresseemploye as adr,mailemploye as mail from contactemploye"
                    + " where idpersonnel="+emp+" order by modificationcontacte desc";
            conn=Connexion.getConn();
            s=conn.createStatement();
            ResultSet res=s.executeQuery(req);
            res.next();
            ret=new ContactEmploye(emp,res.getInt("tel"),res.getString("adr"),res.getString("mail"));
            ret.idContactEmploye=res.getInt("id");
        }
       catch(Exception e){}
       finally
       {
            if(s!=null)
            {
                s.close();
            }
            if(conn!=null)
            {
                conn.close();
            }
       }
       return ret;
   }
   
    public static ArrayList findAll(long emp) throws Exception
    {
        ArrayList ret=new ArrayList();
        Connection conn=null;
        Statement s=null;
        try
        {
            String req = "select idcontactemploye as id,telephoneemploye as tel,adresseemploye as adr,mailemploye as mail from contactemploye"
                    + " where idpersonnel="+emp+" order by modificationcontacte desc";
            conn=Connexion.getConn();
            s=conn.createStatement();
            ResultSet res=s.executeQuery(req);
            ContactEmploye contact;
            while(res.next())
            {
                contact=new ContactEmploye(emp,res.getInt("tel"),res.getString("adr"),res.getString("mail"));
                contact.idContactEmploye=res.getInt("id");
                ret.add(contact);
            }
        }
        catch(Exception e){}
        finally
        {
            if(s!=null)
            {
                s.close();
            }
            if(conn!=null)
            {
                conn.close();
            }
        }
        return ret;
   }
    
    public static void delete(long id) throws Exception
    {
        Connection conn=null;
        Statement s=null;
        try
        {
            String req = "DELETE FROM contactemploye where idcontactemploye="+id;
            conn=Connexion.getConn();
            s=conn.createStatement();
            s.executeUpdate(req);
        }
        catch(Exception e)
        {
        }
        finally
        {
            if(s!=null)
            {
                s.close();
            }
            if(conn!=null)
            {
                conn.close();
            }
        }
    }
}