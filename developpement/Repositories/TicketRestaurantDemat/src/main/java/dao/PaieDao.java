package dao;

import dto.PaieDto;

public interface PaieDao {
    default PaieDto getPaieDTO() {
        return null;
    }

     default void mettreAjourPaieDto(PaieDto paieDto) throws Exception {

    }
}
