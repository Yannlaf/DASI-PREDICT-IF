package fr.insalyon.dasi.ihm.console;

import fr.insalyon.dasi.dao.JpaUtil;
import fr.insalyon.dasi.metier.modele.Client;
import fr.insalyon.dasi.metier.modele.Employe;
import fr.insalyon.dasi.metier.service.Service;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author DASI Team
 */
public class Main {

    public static void main(String[] args) throws ParseException {

        JpaUtil.init();

        //initialiserClients();  
        //initialiserEmployes(); 
        //testerInscriptionClient();  
        //testerInscriptionEmploye();
        //testerRechercheClient();   
        //testerRechercheEmploye();
        //testerListeClients();    
        //testerListeEmployes();
        //testerAuthentificationClient(); 
        //testerAuthentificationEmploye();
        //saisirInscriptionClient();       
        //saisirRechercheClient();
        saisirRechercheEmploye();

        JpaUtil.destroy();
    }

    public static void afficherClient(Client client) {
        System.out.println("-> " + client);
    }
    
    public static void afficherEmploye(Employe employe) {
        System.out.println("-> " + employe);
    }

    public static void initialiserClients() throws ParseException {
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String dateInString = "07-10-1987";
        Date date = formatter.parse(dateInString);
        
        System.out.println();
        System.out.println("**** initialiserClients() ****");
        System.out.println();
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DASI-PU");
        EntityManager em = emf.createEntityManager();
        Client ada = new Client("Lovelace", "Ada",date,"128 bd du 11/11/1918","0574849587","MME","ada.lovelace@insa-lyon.fr", "Ada1012");
        //Client blaise = new Client("Pascal", "Blaise", "blaise.pascal@insa-lyon.fr", "Blaise1906");
        //Client fred = new Client("Fotiadu", "Frédéric", "frederic.fotiadu@insa-lyon.fr", "INSA-Forever");
        
        System.out.println();
        System.out.println("** Clients avant persistance: ");
        afficherClient(ada);
        //afficherClient(blaise);
        //afficherClient(fred);
        System.out.println();

        try {
            em.getTransaction().begin();
            em.persist(ada);
            //em.persist(blaise);
            //em.persist(fred);
            em.getTransaction().commit();
        } catch (Exception ex) {
            Logger.getAnonymousLogger().log(Level.WARNING, "Exception lors de l'appel au Service", ex);
            try {
                em.getTransaction().rollback();
            }
            catch (IllegalStateException ex2) {
                // Ignorer cette exception...
            }
        } finally {
            em.close();
        }

        System.out.println();
        System.out.println("** Clients après persistance: ");
        afficherClient(ada);
        //afficherClient(blaise);
        //afficherClient(fred);
        System.out.println();
    }
    
    public static void initialiserEmployes() throws ParseException {
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String dateInString = "07-10-1987";
        Date date = formatter.parse(dateInString);
        
        System.out.println();
        System.out.println("**** initialiserEmploye() ****");
        System.out.println();
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DASI-PU");
        EntityManager em = emf.createEntityManager();
        
        Employe ada = new Employe("Lovelace", "Ada",date,"128 bd du 11/11/1918","0572849587","MME","F","ad.lovelace@insa-lyon.fr", "Ada1012",10);
        //Employe blaise = new Employe("Pascal", "Blaise", "blaise.pascal@insa-lyon.fr", "Blaise1906");
        //Employe fred = new Employe("Fotiadu", "Frédéric", "frederic.fotiadu@insa-lyon.fr", "INSA-Forever");
        
        System.out.println();
        System.out.println("** Employe avant persistance: ");
        afficherEmploye(ada);
        //afficherEmploye(blaise);
        //afficherEmploye(fred);
        System.out.println();

        try {
            em.getTransaction().begin();
            em.persist(ada);
            //em.persist(blaise);
            //em.persist(fred);
            em.getTransaction().commit();
        } catch (Exception ex) {
            Logger.getAnonymousLogger().log(Level.WARNING, "Exception lors de l'appel au Service", ex);
            try {
                em.getTransaction().rollback();
            }
            catch (IllegalStateException ex2) {
                // Ignorer cette exception...
            }
        } finally {
            em.close();
        }

        System.out.println();
        System.out.println("** Employe après persistance: ");
        afficherEmploye(ada);
        //afficherEmploye(blaise);
        //afficherEmploye(fred);
        System.out.println();
    }

    public static void testerInscriptionClient() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String dateInString = "07-10-1987";
        Date date = formatter.parse(dateInString);
        
        System.out.println();
        System.out.println("**** testerInscriptionClient() ****");
        System.out.println();
        
        Service service = new Service();
        Client claude = new Client("Chappe", "Claude",date,"128 bd du 11/11/1918","0574219587","Mr", "claude.chappe@insa-lyon.fr", "HaCKeR");
        Long idClaude = service.inscrireClient(claude);
        if (idClaude != null) {
            System.out.println("> Succès inscription");
        } else {
            System.out.println("> Échec inscription");
        }
        afficherClient(claude);

        Client hedy = new Client("Lamarr", "Hedy",date,"128 bd du 11/11/1918","0574959587","Mr", "hlamarr@insa-lyon.fr", "WiFi");
        Long idHedy = service.inscrireClient(hedy);
        if (idHedy != null) {
            System.out.println("> Succès inscription");
        } else {
            System.out.println("> Échec inscription");
        }
        afficherClient(hedy);

        Client hedwig = new Client("Lamarr", "Hedwig Eva Maria",date,"128 bd du 11/11/1918","0579949587","Mr", "hed@insa-lyon.fr", "WiFi");
        Long idHedwig = service.inscrireClient(hedwig);
        if (idHedwig != null) {
            System.out.println("> Succès inscription");
        } else {
            System.out.println("> Échec inscription");
        }
        afficherClient(hedwig);
        
        //creer profil astral 
        
    }
    
    public static void testerInscriptionEmploye() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String dateInString = "07-10-1987";
        Date date = formatter.parse(dateInString);
        
        System.out.println();
        System.out.println("**** testerInscriptionEmploye() ****");
        System.out.println();
        
        Service service = new Service();
        Employe claude = new Employe("Chappe", "Claude",date,"128 bd du 11/11/1918","0574219587","Mr","M", "claude.chappe@insa-lyon.fr", "HaCKeR",56);
        Long idClaude = service.inscrireEmploye(claude);
        if (idClaude != null) {
            System.out.println("> Succès inscription");
        } else {
            System.out.println("> Échec inscription");
        }
        afficherEmploye(claude);

        Employe hedy = new Employe("Lamarr", "Hedy",date,"128 bd du 11/11/1918","0574959587","Mr","M","hlamarr@insa-lyon.fr", "WiFi",15);
        Long idHedy = service.inscrireEmploye(hedy);
        if (idHedy != null) {
            System.out.println("> Succès inscription");
        } else {
            System.out.println("> Échec inscription");
        }
        afficherEmploye(hedy);

        Employe hedwig = new Employe("Lamarr", "Hedwig Eva Maria",date,"128 bd du 11/11/1918","0579949587","Mr","M", "hed@insa-lyon.fr", "WiFi",0);
        Long idHedwig = service.inscrireEmploye(hedwig);
        if (idHedwig != null) {
            System.out.println("> Succès inscription");
        } else {
            System.out.println("> Échec inscription");
        }
        afficherEmploye(hedwig);
    }
     
    public static void testerRechercheClient() {
        
        System.out.println();
        System.out.println("**** testerRechercheClient() ****");
        System.out.println();
        
        Service service = new Service();
        long id;
        Client client;

        id = 1;
        System.out.println("** Recherche du Client #" + id);
        client = service.rechercherClientParId(id);
        if (client != null) {
            afficherClient(client);
        } else {
            System.out.println("=> Client non-trouvé");
        }

        id = 3;
        System.out.println("** Recherche du Client #" + id);
        client = service.rechercherClientParId(id);
        if (client != null) {
            afficherClient(client);
        } else {
            System.out.println("=> Client non-trouvé");
        }

        id = 17;
        System.out.println("** Recherche du Client #" + id);
        client = service.rechercherClientParId(id);
        if (client != null) {
            afficherClient(client);
        } else {
            System.out.println("=> Client #" + id + " non-trouvé");
        }
    }

    public static void testerRechercheEmploye() {
        
        System.out.println();
        System.out.println("**** testerRechercheEmploye() ****");
        System.out.println();
        
        Service service = new Service();
        long id;
        Employe employe;

        id = 1;
        System.out.println("** Recherche du Employe #" + id);
        employe = service.rechercherEmployeParId(id);
        if (employe != null) {
            afficherEmploye(employe);
        } else {
            System.out.println("=> Employe non-trouvé");
        }

        id = 3;
        System.out.println("** Recherche du Employe #" + id);
        employe = service.rechercherEmployeParId(id);
        if (employe != null) {
            afficherEmploye(employe);
        } else {
            System.out.println("=> Employe non-trouvé");
        }

        id = 17;
        System.out.println("** Recherche du Employe #" + id);
        employe = service.rechercherEmployeParId(id);
        if (employe != null) {
            afficherEmploye(employe);
        } else {
            System.out.println("=> Employe #" + id + " non-trouvé");
        }
    }
    
    public static void testerListeClients() {
        
        System.out.println();
        System.out.println("**** testerListeClients() ****");
        System.out.println();
        
        Service service = new Service();
        List<Client> listeClients = service.listerClients();
        System.out.println("*** Liste des Clients");
        if (listeClients != null) {
            for (Client client : listeClients) {
                afficherClient(client);
            }
        }
        else {
            System.out.println("=> ERREUR...");
        }
    }
    
    public static void testerListeEmployes() {
        
        System.out.println();
        System.out.println("**** testerListeEmployes() ****");
        System.out.println();
        
        Service service = new Service();
        List<Employe> listeEmployes = service.listerEmployes();
        System.out.println("*** Liste des Employes");
        if (listeEmployes != null) {
            for (Employe employe : listeEmployes) {
                afficherEmploye(employe);
            }
        }
        else {
            System.out.println("=> ERREUR...");
        }
    }

    public static void testerAuthentificationClient() {
        
        System.out.println();
        System.out.println("**** testerAuthentificationClient() ****");
        System.out.println();
        
        Service service = new Service();
        Client client;
        String mail;
        String motDePasse;

        mail = "claude.chappe@insa-lyon.fr";
        motDePasse = "HaCKeR";
        client = service.authentifierClient(mail, motDePasse);
        if (client != null) {
            System.out.println("Authentification réussie avec le mail '" + mail + "' et le mot de passe '" + motDePasse + "'");
            afficherClient(client);
        } else {
            System.out.println("Authentification échouée avec le mail '" + mail + "' et le mot de passe '" + motDePasse + "'");
        }

        mail = "claude.chappe@insa-lyon.fr";
        motDePasse = "HaCKeR77";
        client = service.authentifierClient(mail, motDePasse);
        if (client != null) {
            System.out.println("Authentification réussie avec le mail '" + mail + "' et le mot de passe '" + motDePasse + "'");
            afficherClient(client);
        } else {
            System.out.println("Authentification échouée avec le mail '" + mail + "' et le mot de passe '" + motDePasse + "'");
        }

        mail = "etudiant.fictif@insa-lyon.fr";
        motDePasse = "********";
        client = service.authentifierClient(mail, motDePasse);
        if (client != null) {
            System.out.println("Authentification réussie avec le mail '" + mail + "' et le mot de passe '" + motDePasse + "'");
            afficherClient(client);
        } else {
            System.out.println("Authentification échouée avec le mail '" + mail + "' et le mot de passe '" + motDePasse + "'");
        }
    }
    
    public static void testerAuthentificationEmploye() {
        
        System.out.println();
        System.out.println("**** testerAuthentificationEmploye() ****");
        System.out.println();
        
        Service service = new Service();
        Employe employe;
        String mail;
        String motDePasse;

        mail = "hlamarr@insa-lyon.fr";
        motDePasse = "WiFi";
        employe = service.authentifierEmploye(mail, motDePasse);
        if (employe != null) {
            System.out.println("Authentification réussie avec le mail '" + mail + "' et le mot de passe '" + motDePasse + "'");
            afficherEmploye(employe);
        } else {
            System.out.println("Authentification échouée avec le mail '" + mail + "' et le mot de passe '" + motDePasse + "'");
        }

        mail = "hlamarr@insa-lyon.fr";
        motDePasse = "WiFi88";
        employe = service.authentifierEmploye(mail, motDePasse);
        if (employe != null) {
            System.out.println("Authentification réussie avec le mail '" + mail + "' et le mot de passe '" + motDePasse + "'");
            afficherEmploye(employe);
        } else {
            System.out.println("Authentification échouée avec le mail '" + mail + "' et le mot de passe '" + motDePasse + "'");
        }

        mail = "etudiant.fictif@insa-lyon.fr";
        motDePasse = "********";
        employe = service.authentifierEmploye(mail, motDePasse);
        if (employe != null) {
            System.out.println("Authentification réussie avec le mail '" + mail + "' et le mot de passe '" + motDePasse + "'");
            afficherEmploye(employe);
        } else {
            System.out.println("Authentification échouée avec le mail '" + mail + "' et le mot de passe '" + motDePasse + "'");
        }
    }

    public static void saisirInscriptionClient() throws ParseException {
        Service service = new Service();
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        

        System.out.println();
        System.out.println("Appuyer sur Entrée pour passer la pause...");
        Saisie.pause();

        System.out.println();
        System.out.println("**************************");
        System.out.println("** NOUVELLE INSCRIPTION **");
        System.out.println("**************************");
        System.out.println();

        String nom = Saisie.lireChaine("Nom ? ");
        String prenom = Saisie.lireChaine("Prénom ? ");
        String dateNaissanceString = Saisie.lireChaine("Date de Naissance ? (Format : dd-MM-yyyy) ");
        String adressePostale = Saisie.lireChaine("Adresse Postale ? ");
        String numeroTelephone = Saisie.lireChaine("Numero de Telephone ? ");
        String civilite = Saisie.lireChaine("Civilité ? ");
        String mail = Saisie.lireChaine("Mail ? ");
        String motDePasse = Saisie.lireChaine("Mot de passe ? ");
        
        Date dateNaissance = formatter.parse(dateNaissanceString);

        Client client = new Client(nom,prenom,dateNaissance,adressePostale,numeroTelephone,civilite,mail,motDePasse);
        Long idClient = service.inscrireClient(client);

        if (idClient != null) {
            System.out.println("> Succès inscription");
        } else {
            System.out.println("> Échec inscription");
        }
        afficherClient(client);

    }

    public static void saisirRechercheClient() {
        Service service = new Service();

        System.out.println();
        System.out.println("*********************");
        System.out.println("** MENU INTERACTIF **");
        System.out.println("*********************");
        System.out.println();

        Saisie.pause();

        System.out.println();
        System.out.println("**************************");
        System.out.println("** RECHERCHE de CLIENTS **");
        System.out.println("**************************");
        System.out.println();
        System.out.println();
        System.out.println("** Recherche par Identifiant:");
        System.out.println();

        Integer idClient = Saisie.lireInteger("Identifiant ? [0 pour quitter] ");
        while (idClient != 0) {
            Client client = service.rechercherClientParId(idClient.longValue());
            if (client != null) {
                afficherClient(client);
            } else {
                System.out.println("=> Client #" + idClient + " non-trouvé");
            }
            System.out.println();
            idClient = Saisie.lireInteger("Identifiant ? [0 pour quitter] ");
        }

        System.out.println();
        System.out.println("********************************");
        System.out.println("** AUTHENTIFICATION de CLIENT **");
        System.out.println("********************************");
        System.out.println();
        System.out.println();
        System.out.println("** Authentifier Client:");
        System.out.println();

        String clientMail = Saisie.lireChaine("Mail ? [0 pour quitter] ");

        while (!clientMail.equals("0")) {
            String clientMotDePasse = Saisie.lireChaine("Mot de passe ? ");
            Client client = service.authentifierClient(clientMail, clientMotDePasse);
            if (client != null) {
                afficherClient(client);
            } else {
                System.out.println("=> Client non-authentifié");
            }
            clientMail = Saisie.lireChaine("Mail ? [0 pour quitter] ");
        }

        System.out.println();
        System.out.println("*****************");
        System.out.println("** AU REVOIR ! **");
        System.out.println("*****************");
        System.out.println();

    }
    
    public static void saisirRechercheEmploye() {
        Service service = new Service();

        System.out.println();
        System.out.println("*********************");
        System.out.println("** MENU INTERACTIF **");
        System.out.println("*********************");
        System.out.println();

        Saisie.pause();

        System.out.println();
        System.out.println("**************************");
        System.out.println("** RECHERCHE d'Employes **");
        System.out.println("**************************");
        System.out.println();
        System.out.println();
        System.out.println("** Recherche par Identifiant:");
        System.out.println();

        Integer idEmploye = Saisie.lireInteger("Identifiant ? [0 pour quitter] ");
        while (idEmploye != 0) {
            Employe Employe = service.rechercherEmployeParId(idEmploye.longValue());
            if (Employe != null) {
                afficherEmploye(Employe);
            } else {
                System.out.println("=> Employe #" + idEmploye + " non-trouvé");
            }
            System.out.println();
            idEmploye = Saisie.lireInteger("Identifiant ? [0 pour quitter] ");
        }

        System.out.println();
        System.out.println("********************************");
        System.out.println("** AUTHENTIFICATION d'EMPLOYES **");
        System.out.println("********************************");
        System.out.println();
        System.out.println();
        System.out.println("** Authentifier Employe:");
        System.out.println();

        String EmployeMail = Saisie.lireChaine("Mail ? [0 pour quitter] ");

        while (!EmployeMail.equals("0")) {
            String EmployeMotDePasse = Saisie.lireChaine("Mot de passe ? ");
            Employe Employe = service.authentifierEmploye(EmployeMail, EmployeMotDePasse);
            if (Employe != null) {
                afficherEmploye(Employe);
            } else {
                System.out.println("=> Employe non-authentifié");
            }
            EmployeMail = Saisie.lireChaine("Mail ? [0 pour quitter] ");
        }

        System.out.println();
        System.out.println("*****************");
        System.out.println("** AU REVOIR ! **");
        System.out.println("*****************");
        System.out.println();

    }
}
