package dao;

import model.TicketRestaurantDemat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.sql.Timestamp;

public class TicketRestaurantDematDaoImpl implements TicketRestaurantDematDao {

    public  static  final String PARAM_NUMERO_CART = "numeroCarte";
    public static  final String PARAM_ID_CART = "indicateurCarte";
    public static final String PARAM_DTS_CDE_CART = "dateCommandeCarte";
    public static final String PARAM_DTS_OUV_DIM = "dateOuvertureDimanche";

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;


    @Override
    public void insert(TicketRestaurantDemat ticketRestaurantDemat) {
        StringBuilder insert = new StringBuilder();
        insert.append("INSERT INTO");
        insert.append("TRDEMAT(NO_INT, ID_CART, DTS_CDE_CART, DTS_OUV_DIM)");
        insert.append("VALUES(:numeroCarte, :indicateurCarte, :dateCommandeCarte, :dateOuvertureDimanche");

        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
        mapSqlParameterSource.addValue(PARAM_NUMERO_CART, ticketRestaurantDemat.getNumeroCarte());
        mapSqlParameterSource.addValue(PARAM_DTS_CDE_CART, new Timestamp(ticketRestaurantDemat.getDateCommandeCarte().getTime()));
        mapSqlParameterSource.addValue(PARAM_DTS_OUV_DIM, new Timestamp(ticketRestaurantDemat.getOuvertureDimanche().getTime()));
        mapSqlParameterSource.addValue(PARAM_ID_CART, ticketRestaurantDemat.getIndicateurCarte());
        namedParameterJdbcTemplate.update(insert.toString(), mapSqlParameterSource);

    }

    @Override
    public TicketRestaurantDemat getById(String numeroCarte) {

        return null;
    }

    @Override
    public void update(TicketRestaurantDemat ticketRestaurantDemat) {
        StringBuilder update = new StringBuilder();
        update.append("UPDATE TRDEMAT SET");
        update.append("ID_CART= : indicateurCarte, ");
        update.append(" DTS_CDE_CART= : dateCommandeCarte");
        update.append(" NO_INT= :numeroCarte ");

        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
        mapSqlParameterSource.addValue(PARAM_NUMERO_CART, ticketRestaurantDemat.getNumeroCarte());
        mapSqlParameterSource.addValue(PARAM_DTS_CDE_CART, new Timestamp(ticketRestaurantDemat.getDateCommandeCarte().getTime()));
        mapSqlParameterSource.addValue(PARAM_DTS_OUV_DIM, new Timestamp(ticketRestaurantDemat.getOuvertureDimanche().getTime()));
        mapSqlParameterSource.addValue(PARAM_ID_CART, ticketRestaurantDemat.getIndicateurCarte());
        namedParameterJdbcTemplate.update(update.toString(), mapSqlParameterSource);

    }

}
