/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

/**
 *
 * @author user
 */
import interfaces.clientInterfaces;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import models.client;

import util.Myconnexion;
public  class clientServices implements clientInterfaces 
{





    //var
    Connection cnx = Myconnexion.getInstance().getCnx();

    @Override
    
          public void addclient (client c) {
       try {
         String req = "INSERT INTO client (id_client, nom,prenom,num_tel,adresse,sexe,mail) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement ps = cnx.prepareStatement(req);
            ps.setInt(1,c.getId());
            ps.setString(2, c.getName());
            ps.setString(3, c.getprenom());
            ps.setLong(4, c.getNumber());
            ps.setString(5, c.getadresse());
            ps.setString(6, c.getsexe());
            ps.setString(7, c.getmail());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        }

    @Override
    public void modifierclient(int id, String nom, String prenom) {
        try
        {
            String req = "UPDATE client SET nom = '" + nom + "', prenom = '" + prenom + "' WHERE client.`id` = " + id;
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("client updated !");
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    

    @Override
    public void afficherclient(client c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<client> fetchclient() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void supprimerclient (int id)  {
       
        try {
            String req = "DELETE FROM client WHERE id_client = "+id;
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("client deleted successfully!");
        } catch (SQLException ex) {
        }
        
        
    }
    }


    
   

   // @Override
   // public void modifierclient(int id ,String nom, String prenom){

     //}

  

   /* @Override
      public List<client> fetchclient() 
    {
        List<client> client = new ArrayList<>();
        try {
            
            String req = "SELECT * FROM client";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req);
            while (rs.next())
            {                
                client c = new client();
                c.setId(rs.getInt(1));
                c.setName(rs.getString(2));
                c.setprenom(rs.getString(3));
                c.setNumber(rs.getInt("number"));
                c.setadresse(rs.getString(5));
                c.setsexe(rs.getString(6));
                c.setmail(rs.getString(7));
               
                
                client.add(c);
            }
            
        } catch (SQLException ex) {
        }
        
        return client;
    }*/
     

    /**
     *
     * @param c
     */
    
    
        
    

    


