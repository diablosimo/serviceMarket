package entity;



public class Approuvementdemande {
    private Long id;
    private String emailWorker;
    private Long demandeserviceId;
    private Byte accepted;

   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    public String getEmailWorker() {
        return emailWorker;
    }

    public void setEmailWorker(String emailWorker) {
        this.emailWorker = emailWorker;
    }

   
    public Long getDemandeserviceId() {
        return demandeserviceId;
    }

    public void setDemandeserviceId(Long demandeserviceId) {
        this.demandeserviceId = demandeserviceId;
    }

    
    public Byte getAccepted() {
        return accepted;
    }

    public void setAccepted(Byte accepted) {
        this.accepted = accepted;
    }

    
}
