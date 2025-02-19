/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.beans;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import java.io.IOException;

/**
 *
 * @author lmr
 */
@Named
@RequestScoped
public class NavigationBeans {
    public void voirApropos(){
        try{
            FacesContext.getCurrentInstance().getExternalContext().redirect("a_propos.xhtml");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
