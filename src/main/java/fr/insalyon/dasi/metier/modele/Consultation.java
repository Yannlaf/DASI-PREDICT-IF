/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insalyon.dasi.metier.modele;

/**
 *
 * @author Admin
 */
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idClient;
    private Long idEmploye;
    private Long idMedium;
    private Date dateConsultation;
    private Date heureDebut;
    private Date heureFin;
    private String commentaire;
    private Date heureDemande;
    /*constructeur*/

    public Consultation(Long idClient, Long idMedium, Date dateConsultation, Date heureDemande) {
        this.idClient = idClient;
        this.idMedium = idMedium;
        this.dateConsultation = dateConsultation;
        this.heureDemande = heureDemande;
    }
  
    /*getter*/
    public Date getDateConsultation() {
        return dateConsultation;
    }

    public Date getHeureDebut() {
        return heureDebut;
    }

    public Date getHeureFin() {
        return heureFin;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public Date getHeureDemande() {
        return heureDemande;
    }
    
    /*setter*/

    public void setHeureDebut(Date heureDebut) {
        this.heureDebut = heureDebut;
    }

    public void setHeureFin(Date heureFin) {
        this.heureFin = heureFin;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
    
}
