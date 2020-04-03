/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insalyon.dasi.dao;

import fr.insalyon.dasi.metier.modele.Employe;
import fr.insalyon.dasi.metier.modele.Medium;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Ghali
 */
public class MediumDao {
    public void creer(Medium medium) {
        EntityManager em = JpaUtil.obtenirContextePersistance();
        em.persist(medium);
    }
    
    public Employe chercherParId(Long MediumId) {
        EntityManager em = JpaUtil.obtenirContextePersistance();
        return em.find(Employe.class, MediumId); // renvoie null si l'identifiant n'existe pas
    }
    
    public List<Employe> listerMediums() {
        EntityManager em = JpaUtil.obtenirContextePersistance();
        TypedQuery<Employe> query = em.createQuery("SELECT e FROM Employe e ORDER BY c.nom ASC, c.prenom ASC", Employe.class);
        return query.getResultList();
    }
}
