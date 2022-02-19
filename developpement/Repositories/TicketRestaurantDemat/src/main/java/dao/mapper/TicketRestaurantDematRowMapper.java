package dao.mapper;

import model.TicketRestaurantDemat;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TicketRestaurantDematRowMapper {

    public TicketRestaurantDemat mapRow(ResultSet rs, int rowNum) throws SQLException{
        TicketRestaurantDemat ticketRestaurantDemat = new TicketRestaurantDemat();
        ticketRestaurantDemat.setNumeroCarte(rs.getString("NO_INT"));
        ticketRestaurantDemat.setIndicateurCarte(rs.getString("ID_CART"));
        ticketRestaurantDemat.setDateCommandeCarte(rs.getDate("DTS_CDE_CAR"));
        ticketRestaurantDemat.setOuvertureDimanche(rs.getDate("DTS_OUV_DIM"));

        return ticketRestaurantDemat;
    }
}
