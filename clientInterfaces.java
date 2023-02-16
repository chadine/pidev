/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author user
 */

    package interfaces;

import java.util.List;
import models.client;


/**
 *
 * @author admin
 */
public interface clientInterfaces{
    
    
    public void addclient(client c);
    public void modifierclient(int id ,String nom, String prenom);

    /**
     *
     * @param id
     * @param c
     */
    public void supprimerclient(int id );
    public void afficherclient(client c);
    
    
    //list : select
    public List<client> fetchclient();
    
    //affectation
 
    
}
    

