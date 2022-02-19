package dao;

import model.TicketRestaurantDemat;

public interface TicketRestaurantDematDao {

    void insert(TicketRestaurantDemat ticketRestaurantDemat);

    TicketRestaurantDemat getById(String numeroCarte);

    void update(TicketRestaurantDemat ticketRestaurantDemat);
}
