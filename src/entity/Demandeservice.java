package entity;


import java.util.Date;

public class Demandeservice {
    private Long id;
    private Date dateconfirmation;
    private Date datederniermodif;
    private Date datesuppression;
    private Date datedemande;
    private Date dateservice;
    private String detail;
    private String clientEmail;
    private Long secteurId;
    private Long servicetypeId;
    private String workerEmail;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    public Date getDateconfirmation() {
        return dateconfirmation;
    }

    public void setDateconfirmation(Date dateconfirmation) {
        this.dateconfirmation = dateconfirmation;
    }

    
    public Date getDatederniermodif() {
        return datederniermodif;
    }

    public void setDatederniermodif(Date datederniermodif) {
        this.datederniermodif = datederniermodif;
    }

   
    public Date getDatesuppression() {
        return datesuppression;
    }

    public void setDatesuppression(Date datesuppression) {
        this.datesuppression = datesuppression;
    }

    
    public Date getDatedemande() {
        return datedemande;
    }

    public void setDatedemande(Date datedemande) {
        this.datedemande = datedemande;
    }

    
    public Date getDateservice() {
        return dateservice;
    }

    public void setDateservice(Date dateservice) {
        this.dateservice = dateservice;
    }

    
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    
    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    
    public Long getSecteurId() {
        return secteurId;
    }

    public void setSecteurId(Long secteurId) {
        this.secteurId = secteurId;
    }

    
    public Long getServicetypeId() {
        return servicetypeId;
    }

    public void setServicetypeId(Long servicetypeId) {
        this.servicetypeId = servicetypeId;
    }

   
    public String getWorkerEmail() {
        return workerEmail;
    }

    public void setWorkerEmail(String workerEmail) {
        this.workerEmail = workerEmail;
    }

    
}
