/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insalyon.dasi.metier.modele;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author Ghali
 */
@Entity
public class Spirite extends Medium implements Serializable {
    private String support;

    public Spirite() {
    }

    public Spirite(String support, String denomination, String genre, String presentation, String nbConsultation, String civilite) {
        super(denomination, genre, presentation, nbConsultation, civilite);
        this.support = support;
    }

    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }
}
