package entity;



public class Client {
    private String email;
    private String adressecomplement;
    private Byte blocked;
    private String nom;
    private String password;
    private String phone;
    private String prenom;
    private String cin;
    private Long secteurId;

   
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getAdressecomplement() {
        return adressecomplement;
    }

    public void setAdressecomplement(String adressecomplement) {
        this.adressecomplement = adressecomplement;
    }

    
    public Byte getBlocked() {
        return blocked;
    }

    public void setBlocked(Byte blocked) {
        this.blocked = blocked;
    }

    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

   
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

   
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

   
    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    
    public Long getSecteurId() {
        return secteurId;
    }

    public void setSecteurId(Long secteurId) {
        this.secteurId = secteurId;
    }

    
}
