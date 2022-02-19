package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table( name = "TRDEMAT")
 
public class TicketRestaurantDemat implements Serializable {
    @Id
    @Column(name = "NO_INT")
    private  String numeroCarte;

    @Column(name = "IND_CART")
    private  String indicateurCarte;

    @Column(name = "DTS_CDE_CART")
    private Date dateCommandeCarte;

    @Column(name = "DTS_OUV_DIM")
    private  Date ouvertureDimanche;


    public String getNumeroCarte() {
        return numeroCarte;
    }

    public void setNumeroCarte(String numeroCarte) {
        this.numeroCarte = numeroCarte;
    }

    public String getIndicateurCarte() {
        return indicateurCarte;
    }

    public void setIndicateurCarte(String indicateurCarte) {
        this.indicateurCarte = indicateurCarte;
    }

    public Date getDateCommandeCarte() {
        return dateCommandeCarte;
    }

    public void setDateCommandeCarte(Date dateCommandeCarte) {
        this.dateCommandeCarte = dateCommandeCarte;
    }

    public Date getOuvertureDimanche() {
        return ouvertureDimanche;
    }

    public void setOuvertureDimanche(Date ouvertureDimanche) {
        this.ouvertureDimanche = ouvertureDimanche;
    }

}
