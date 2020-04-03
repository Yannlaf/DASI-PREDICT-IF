package fr.insalyon.dasi.metier.modele;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-03T19:40:21")
@StaticMetamodel(Consultation.class)
public class Consultation_ { 

    public static volatile SingularAttribute<Consultation, Long> idClient;
    public static volatile SingularAttribute<Consultation, Date> heureDebut;
    public static volatile SingularAttribute<Consultation, Date> dateConsultation;
    public static volatile SingularAttribute<Consultation, Date> heureDemande;
    public static volatile SingularAttribute<Consultation, Long> id;
    public static volatile SingularAttribute<Consultation, Date> heureFin;
    public static volatile SingularAttribute<Consultation, String> commentaire;
    public static volatile SingularAttribute<Consultation, Long> idEmploye;
    public static volatile SingularAttribute<Consultation, Long> idMedium;

}