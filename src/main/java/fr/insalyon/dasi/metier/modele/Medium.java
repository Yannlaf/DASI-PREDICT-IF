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

/**
 *
 * @author Ghali
 */
@Entity
public abstract class Medium implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String denomination;
    private String genre;
    private String presentation;
    private String nbConsultation;
    private String civilite;

    public Medium() {
    }

    public Medium(String denomination, String genre, String presentation, String nbConsultation, String civilite) {
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

    public String getNbConsultation() {
        return nbConsultation;
    }

    public void setNbConsultation(String nbConsultation) {
        this.nbConsultation = nbConsultation;
    }
    
}
