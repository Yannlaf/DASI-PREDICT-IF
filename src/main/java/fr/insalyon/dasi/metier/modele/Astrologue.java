/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insalyon.dasi.metier.modele;

import javax.persistence.Entity;

/**
 *
 * @author Ghali
 */
@Entity
public class Astrologue extends Medium {
    
    private String formation;
    private String promotion;

    public Astrologue() {
    }

    public Astrologue(String formation, String promotion, String denomination, String genre, String presentation, int nbConsultation, String civilite) {
        super(denomination, genre, presentation, nbConsultation, civilite);
        this.formation = formation;
        this.promotion = promotion;
    }

    public String getFormation() {
        return formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }

    public String getPromotion(){
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    @Override
    public String toString() {
        return super.toString()+" formation:"+formation+" promotion:"+promotion; //To change body of generated methods, choose Tools | Templates.
    }

}
