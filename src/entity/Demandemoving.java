package entity;


public class Demandemoving {
    private Long id;
    private String adressearrive;
    private String adressedepart;
    private Long villearriveId;
    private Long villedepartId;
    private Long demandeserviceId;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    public String getAdressearrive() {
        return adressearrive;
    }

    public void setAdressearrive(String adressearrive) {
        this.adressearrive = adressearrive;
    }

    
    public String getAdressedepart() {
        return adressedepart;
    }

    public void setAdressedepart(String adressedepart) {
        this.adressedepart = adressedepart;
    }

   
    public Long getVillearriveId() {
        return villearriveId;
    }

    public void setVillearriveId(Long villearriveId) {
        this.villearriveId = villearriveId;
    }

    
    public Long getVilledepartId() {
        return villedepartId;
    }

    public void setVilledepartId(Long villedepartId) {
        this.villedepartId = villedepartId;
    }

    
    public Long getDemandeserviceId() {
        return demandeserviceId;
    }

    public void setDemandeserviceId(Long demandeserviceId) {
        this.demandeserviceId = demandeserviceId;
    }

    
}
