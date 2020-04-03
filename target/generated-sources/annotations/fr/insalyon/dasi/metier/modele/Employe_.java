package fr.insalyon.dasi.metier.modele;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-03T18:22:38")
@StaticMetamodel(Employe.class)
public class Employe_ { 

    public static volatile SingularAttribute<Employe, String> motDePasse;
    public static volatile SingularAttribute<Employe, String> mail;
    public static volatile SingularAttribute<Employe, Date> dateNaissance;
    public static volatile SingularAttribute<Employe, String> genre;
    public static volatile SingularAttribute<Employe, Long> id;
    public static volatile SingularAttribute<Employe, String> adressePostale;
    public static volatile SingularAttribute<Employe, String> nom;
    public static volatile SingularAttribute<Employe, String> prenom;
    public static volatile SingularAttribute<Employe, String> numeroTelephone;
    public static volatile SingularAttribute<Employe, Integer> nbConsultation;
    public static volatile SingularAttribute<Employe, String> civilite;

}