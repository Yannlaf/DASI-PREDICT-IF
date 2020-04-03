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
public class Cartomancien extends Medium {

    public Cartomancien() {
    }
    
    public Cartomancien(String denomination, String genre, String presentation, int nbConsultation, String civilite){
        super(denomination, genre, presentation, nbConsultation, civilite);
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
