package entity;


public class Reclamation {
    private Long id;
    private String sujet;
    private String emailReclameur;
    private String emailReclame;

   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    
    public String getEmailReclameur() {
        return emailReclameur;
    }

    public void setEmailReclameur(String emailReclameur) {
        this.emailReclameur = emailReclameur;
    }

   
    public String getEmailReclame() {
        return emailReclame;
    }

    public void setEmailReclame(String emailReclame) {
        this.emailReclame = emailReclame;
    }

   
}
