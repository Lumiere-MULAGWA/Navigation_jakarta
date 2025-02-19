/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.beans;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

/**
 *
 * @author lmr
 */
@Named("Monnaie")
@RequestScoped
public class Monnaie {
    private float prix;
    private float monnaie;
    private String tvar;
    

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
    public float  toFranc(float prix){
        if ( this.tvar.equals("FC")){
            this.monnaie  = prix * 2800;
        }
        if (tvar.equals("$")){
            this.monnaie = (float) (prix * 0.012);
        }
        return this.monnaie;
    }
 public void afficherPrix(){
     System.out.print(this.monnaie);
     
 }
}
