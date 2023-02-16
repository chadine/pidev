/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;

/**
 *
 * @author user
 * @param <P>
 */
public interface reclamationInterfaces <P> {
    


/**
 *
 * @author ASuS
     * @param p
 */

    
    public void envoyer(P p);
    public void modifier(P p);
    public void supprimer(P p);
    public List<P> afficher();

}
    
