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
@Named("currencyConverterBean")
@RequestScoped
public class WelcomeBean {
    private double montant;
    private String devise;
    private String resultat;
    
    // Taux de conversion (exemples fictifs, à actualiser avec les taux réels)
    private static final double TAUX_IDR_USD = 0.012;  // 1 IDR ≈ 0.000065 USD
    private static final double TAUX_IDR_CDF = 32.84;      // 1 IDR ≈ 0.14 CDF

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getDevise() {
        return devise;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

    public String getResultat() {
        return resultat;
    }

    public void convertir() {
        if ("USD".equals(devise)) {
            double conversion = montant * TAUX_IDR_USD;
            resultat = String.format("%.2f Roupie vallent à %.2f USD", montant, conversion);
        } else if ("CDF".equals(devise)) {
            double conversion = montant * TAUX_IDR_CDF;
            resultat = String.format("%.2f Roupie vallent à %.2f CDF", montant, conversion);
        } else {
            resultat = "Devise non prise en charge.";
        }
    }
}