package services;

import dao.TicketRestaurantDematDao;
import dto.TicketRestaurantDto;
import model.TicketRestaurantDemat;
import services.utils.DateHelper;
import transaction.annotation.Transactional;

import javax.annotation.Ressources;
import java.util.logging.Logger;

public class TicketRestaurantDematServiceImpl implements TicketRestaurantDematService {

    private static final String TR_INDICATEUR_OUI = "O";
    private static final String TR_INDICATEUR_NON = "N";

    private  static  Boolean isIndicateurOui(TicketRestaurantDemat ticketRestaurantDemat){
        return ticketRestaurantDemat.getIndicateurCarte().equals(TR_INDICATEUR_OUI);
    }
    private  static  Boolean isIndicateurNon(TicketRestaurantDemat ticketRestaurantDemat){
        return ticketRestaurantDemat.getIndicateurCarte().equals(TR_INDICATEUR_NON);
    }

    @Ressources
    private TicketRestaurantDematDao ticketRestaurantDematDao;

    @Override
    @Transactional(readOnly = true)
    public void ajouterCarteTicketRestaurant(String numeroCarte)  {
        TicketRestaurantDemat newTR = new TicketRestaurantDemat();
        newTR.setNumeroCarte(numeroCarte);
        newTR.setIndicateurCarte(TR_INDICATEUR_OUI);
        newTR.setDateCommandeCarte(DateHelper.getNullDateValue());
        newTR.setOuvertureDimanche(DateHelper.getNullDateValue());

        ticketRestaurantDematDao.insert(newTR);

    }

    public TicketRestaurantDto getTicketRestaurantDematDto(String numeroCarte) throws Exception {
        TicketRestaurantDemat ticketRestaurantDemat = ticketRestaurantDematDao.getById(numeroCarte);
        if(ticketRestaurantDemat == null){
            throw  new Exception("TicketRestaurantDemat l'intérimaire n'existe pas: " + numeroCarte);
        } else return new TicketRestaurantDto(ticketRe staurantDemat);
    }

    @Override
    public void miseAjourCarteTicketRestaurant(TicketRestaurantDemat newTR) throws Exception {
        TicketRestaurantDemat oldTR = ticketRestaurantDematDao.getById(newTR.getNumeroCarte());

        if(oldTR == null){
            throw new Exception("TicketRestaurantDemat l' interimaire n' existe pas: " + newTR.getNumeroCarte());
        } else if (isIndicateurOui(oldTR) && isIndicateurOui(newTR))
            return;
        else if (isIndicateurNon(oldTR) && isIndicateurNon(newTR)){
            return;
        } else if(isIndicateurNon(oldTR) && isIndicateurOui(oldTR)){
            oldTR.setDateCommandeCarte(DateHelper.getNullDateValue());
            oldTR.setOuvertureDimanche(DateHelper.getNullDateValue());
            oldTR.setIndicateurCarte( newTR.getIndicateurCarte());
            ticketRestaurantDematDao.update(oldTR);
        }

        throw new Exception("si le ticket de restaurant est activé il est non modifiable");


    }
}
