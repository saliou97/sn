package services;

import dto.TicketRestaurantDto;
import model.TicketRestaurantDemat;

public interface TicketRestaurantDematService {

    void ajouterCarteTicketRestaurant(String numeroCarte) throws Exception;

    TicketRestaurantDto getTicketRestaurantDematDto(String numeroCarte) throws Exception;

    void miseAjourCarteTicketRestaurant(TicketRestaurantDemat ticketRestaurantDemat) throws Exception;
}
