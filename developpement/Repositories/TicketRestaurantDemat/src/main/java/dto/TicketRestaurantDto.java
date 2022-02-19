package dto;

import model.TicketRestaurantDemat;

import java.util.Date;

public class TicketRestaurantDto {

    private String numeroCarte;
    private String indicateurCarte;
    private Date dateCommandeCarte;
    private Date dateOuvertureDroitDimanche;

    public TicketRestaurantDto(){

    }
    public TicketRestaurantDto(TicketRestaurantDemat ticketRestaurantDemat){

    }

    public TicketRestaurantDto(String numeroCarte, String indicateurCarte, Date dateCommandeCarte, Date dateOuvertureDroitDimanche){
        this.numeroCarte = numeroCarte;
        this.indicateurCarte = indicateurCarte;
        this.dateCommandeCarte = dateCommandeCarte;
        this.dateOuvertureDroitDimanche = dateOuvertureDroitDimanche;
    }

    public String getNumeroCarte(){
        return  numeroCarte;
    }
    public void  setNumeroCarte(String numeroCarte){
        this.numeroCarte = numeroCarte;
    }
    public String getIndicateurCarte(){
        return  indicateurCarte;
    }
    public void  setIndicateurCarte(String indicateurCarte){
        this.indicateurCarte = indicateurCarte;
    }
    public Date getDateCommandeCarte(){
        return  dateCommandeCarte;
    }
    public void  setDateCommandeCarte(Date dateCommandeCarte){
        this.dateCommandeCarte = dateCommandeCarte;
    }
    public Date getDateOuvertureDroitDimanche(){
        return  dateOuvertureDroitDimanche;
    }
    public void  setDateOuvertureDroitDimanche(Date dateOuvertureDroitDimanche){
        this.dateOuvertureDroitDimanche = dateOuvertureDroitDimanche;
    }

}
