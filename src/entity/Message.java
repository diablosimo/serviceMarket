package entity;


import java.util.Date;

public class Message {
    private Long id;
    private String contenu;
    private Date dateenvoi;
    private Byte type;
    private Long conversationId;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

   
    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    
    public Date getDateenvoi() {
        return dateenvoi;
    }

    public void setDateenvoi(Date dateenvoi) {
        this.dateenvoi = dateenvoi;
    }

   
    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    
    public Long getConversationId() {
        return conversationId;
    }

    public void setConversationId(Long conversationId) {
        this.conversationId = conversationId;
    }

    
}
