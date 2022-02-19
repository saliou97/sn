package dao;

import dto.PaieDto;
import dto.TicketRestaurantDto;
import model.TicketRestaurantDemat;
import transaction.annotation.Transactional;

import javax.annotation.Ressources;

public class PaieDaoImpl implements PaieDao{
    @Ressources
    private TicketRestaurantDematDao ticketRestaurantDematDao;

    @Override
    @Transactional(readOnly = true)
    public  void mettreAjourPaieDto(PaieDto paieDto) throws Exception {
        try {
            update(paieDto);
        } catch (Exception e){
            throw new Exception("Erreur lors de la lecture");
        }
    }

    public void update(PaieDto paieDto){
        TicketRestaurantDemat ticketRestaurantDemat = new TicketRestaurantDemat();
        ticketRestaurantDematDao.update(ticketRestaurantDemat);
    }

}
