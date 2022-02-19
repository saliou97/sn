package services;

import dao.TicketRestaurantDematDao;
import dto.PaieDto;
import model.TicketRestaurantDemat;
import transaction.annotation.Transactional;

import javax.annotation.Ressources;

public class PaieServiceImpl implements PaieService {

    @Ressources
    private TicketRestaurantDematDao ticketRestaurantDematDao;

    @Override
    @Transactional(readOnly = true)
    public PaieDto getPaieDTO() {
        PaieDto paieDto = new PaieDto();
        return paieDto;
    }

    @Override
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
