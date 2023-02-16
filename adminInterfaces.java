/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import models.admin;
import models.client;

/**
 *
 * @author user
 */
public interface adminInterfaces {
    
    
    
    public void ajouter (admin am);
    public void modifier(admin am);

    /**
     *
     * @param am
     */
    public void supprimer(admin am);
    public void getall(admin am);
    
   
    
}