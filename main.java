/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import interfaces.clientInterfaces;
import models.admin;
import models.client;
import services.adminServices;
import services.clientServices;
import util.Myconnexion;

/**
 *
 * @author user
 */
public class main {
    public static void main(String[] args) 
    {
       clientInterfaces sp2 = new clientServices();
    /*  client   =new client("jjj","hhhj","hjhj","jkjk","jkkj" ); */
               client c1 =new client(); 
               c1.setName("walid");
               c1.setprenom("abidi");
               c1.setNumber(789456);
               c1.setmail("test@test.tn");
               c1.setadresse("tunis");
               c1.setsexe("homme");
               /*client c2 =new client("12345","00","hj888hj","j44kjk","jk66kj" );*/

    /* adminServices sp =new adminServices() ; */
     sp2.addclient(c1);
     System.out.println("client ");
     
     /*admin am= new admin("15","0dd0","hj8d88hj","jjk","jk66kj") ; 
      admin am1= new admin("jjj","hhhj","hjhj","jkjk","jkkj" ) ; 
     sp.ajouter(am);
      sp.ajouter(am1);
     System.out.println(sp.getall()) ;
      System.out.println(sp.getOneById("15")) ;*/
     /*sp.supprimer("15") ; */
     
    /*sp.ajouter(am) ; 
      sp.ajouter(am2) ;
        sp.ajouter(c) ; 
        sp.supprimer("1234");*/
       
    /* sp.modifier(am1);
     
    System.out.println(sp.getall()) ;
    System.out.println(sp.getOneById("1234")) ;*/
     
    }
    
}
