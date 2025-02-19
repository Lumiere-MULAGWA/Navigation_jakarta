package com.mycompany.mavenproject1.beans;


import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class LieuBeans {
    private String nom;
    private String description;
    private double latitude;
    private double longitude;

    // Liste pour stocker les lieux ajoutés
    private List<Lieu> lieux = new ArrayList<>();

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    // Getter pour la liste des lieux
    public List<Lieu> getLieux() {
        return lieux;
    }

    // Méthode pour ajouter un lieu
    public String ajouterLieu() {
        Lieu lieu = new Lieu(nom, description, latitude, longitude);
        lieux.add(lieu);

        // Réinitialiser le formulaire après l'ajout
        nom = "";
        description = "";
        latitude = 0;
        longitude = 0;

        return null; // Reste sur la même page
    }

    // Classe interne pour représenter un lieu
    public static class Lieu {
        private String nom;
        private String description;
        private double latitude;
        private double longitude;

        public Lieu(String nom, String description, double latitude, double longitude) {
            this.nom = nom;
            this.description = description;
            this.latitude = latitude;
            this.longitude = longitude;
        }

        // Getters
        public String getNom() {
            return nom;
        }

        public String getDescription() {
            return description;
        }

        public double getLatitude() {
            return latitude;
        }

        public double getLongitude() {
            return longitude;
        }
    }
}