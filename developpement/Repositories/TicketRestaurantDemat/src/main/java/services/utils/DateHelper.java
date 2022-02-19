package services.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class DateHelper {

    private static final String  DD_MM_YYYY = "dd/MM/yyyy";
    public static  final String NULL_DATE_VALUE = "0001-01-01";
    public static Date getDateFromString(String dateString, String pattern){
        SimpleDateFormat sdf= new SimpleDateFormat(pattern);
        try{
            return sdf.parse(dateString);
        }catch (ParseException e){
            throw new IllegalStateException("Une erreur est survenue lors du parse de la date", e);
        }
    }
    public static Date getNullDateValue() {
        return  getDateFromString (NULL_DATE_VALUE, "dd/MM/yyyy");
    }
}
