/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insalyon.dasi.dao;

/**
 *
 * @author Admin
 */
import fr.insalyon.dasi.metier.modele.Consultation;
mport javax.persistence.EntityManager;
import javax.persistence.TypedQuery;




public class ConsultationDao {
    
    public void creer(Consultation consultation) {
        EntityManager em = JpaUtil.obtenirContextePersistance();
        em.persist(consultation);
    }

    
}
