package entity;


public class Demandecleaning {
    private Long id;
    private Byte bringequipement;
    private Long nbrcleaner;
    private Long nbrheures;
    private Long demandeserviceId;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

   
    public Byte getBringequipement() {
        return bringequipement;
    }

    public void setBringequipement(Byte bringequipement) {
        this.bringequipement = bringequipement;
    }

   
    public Long getNbrcleaner() {
        return nbrcleaner;
    }

    public void setNbrcleaner(Long nbrcleaner) {
        this.nbrcleaner = nbrcleaner;
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
