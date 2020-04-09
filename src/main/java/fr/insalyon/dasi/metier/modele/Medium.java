/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insalyon.dasi.metier.modele;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author Ghali
 */
@Entity
@Inheritance ( strategy = InheritanceType.JOINED )
public class Medium {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String typeMedium;
    private String denomination;
    private String genre;
    private String presentation;
    private int nbConsultation;
    private String civilite;

    public Medium() {
    }

    public Medium(String typeMedium, String denomination, String genre, String presentation, int nbConsultation, String civilite) {
        this.typeMedium = typeMedium;
        this.denomination = denomination;
        this.genre = genre;
        this.presentation = presentation;
        this.nbConsultation = nbConsultation;
        this.civilite = civilite;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public int getNbConsultation() {
        return nbConsultation;
    }

    public void setNbConsultation(int nbConsultation) {
        this.nbConsultation = nbConsultation;
    }

    @Override
    public String toString() {
        return "Id: "+id+" "+" Type: "+typeMedium + " " + civilite+ " denomination: "+denomination+" genre: "+genre+" presentation: "+presentation+" consulte: "+nbConsultation+" fois"; //To change body of generated methods, choose Tools | Templates.
    }   
}
