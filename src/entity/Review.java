package entity;


import java.util.Date;

public class Review {
    private Long id;
    private Date datereview;
    private Integer stars;
    private String text;
    private String workerEmail;
    private String clientEmail;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

   
    public Date getDatereview() {
        return datereview;
    }

    public void setDatereview(Date datereview) {
        this.datereview = datereview;
    }

   
    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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

    
}
