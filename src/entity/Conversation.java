package entity;



public class Conversation {
    private Long id;
    private String workerEmail;
    private String clientEmail;
    private String blocked;
    private String blockerEmail;


   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    public String getWorkerEmail() {
        return workerEmail;
    }

    public void setWorkerEmail(String workerEmail) {
        this.workerEmail = workerEmail;
    }

    
    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    
    public String getBlocked() {
        return blocked;
    }

    public void setBlocked(String blocked) {
        this.blocked = blocked;
    }

    
    public String getBlockerEmail() {
        return blockerEmail;
    }

    public void setBlockerEmail(String blockerEmail) {
        this.blockerEmail = blockerEmail;
    }

    
}
