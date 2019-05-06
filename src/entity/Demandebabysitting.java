package entity;



public class Demandebabysitting {
    private Long id;
    private Byte fulltime;
    private Long nbrheures;
    private Long demandeserviceId;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

   
    public Byte getFulltime() {
        return fulltime;
    }

    public void setFulltime(Byte fulltime) {
        this.fulltime = fulltime;
    }

   
    public Long getNbrheures() {
        return nbrheures;
    }

    public void setNbrheures(Long nbrheures) {
        this.nbrheures = nbrheures;
    }

    
    public Long getDemandeserviceId() {
        return demandeserviceId;
    }

    public void setDemandeserviceId(Long demandeserviceId) {
        this.demandeserviceId = demandeserviceId;
    }

    
}
