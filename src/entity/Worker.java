package entity;


public class Worker {
    private String email;
    private Byte accepted;
    private Byte blocked;
    private String description;
    private String nom;
    private Integer nombreoperation;
    private String password;
    private String phone;
    private float rating;
    private Integer nbRaiting;
    private String uniteoeuvre;
    private float prixuo;
    private Long servicetypeId;

   
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public Byte getAccepted() {
        return accepted;
    }

    public void setAccepted(Byte accepted) {
        this.accepted = accepted;
    }

   
    public Byte getBlocked() {
        return blocked;
    }

    public void setBlocked(Byte blocked) {
        this.blocked = blocked;
    }

    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

   
    public Integer getNombreoperation() {
        return nombreoperation;
    }

    public void setNombreoperation(Integer nombreoperation) {
        this.nombreoperation = nombreoperation;
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

    
    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    
    public Integer getNbRaiting() {
        return nbRaiting;
    }

    public void setNbRaiting(Integer nbRaiting) {
        this.nbRaiting = nbRaiting;
    }

    
    public String getUniteoeuvre() {
        return uniteoeuvre;
    }

    public void setUniteoeuvre(String uniteoeuvre) {
        this.uniteoeuvre = uniteoeuvre;
    }

    
    public float getPrixuo() {
        return prixuo;
    }

    public void setPrixuo(float prixuo) {
        this.prixuo = prixuo;
    }

    
    public Long getServicetypeId() {
        return servicetypeId;
    }

    public void setServicetypeId(Long servicetypeId) {
        this.servicetypeId = servicetypeId;
    }

    
}
