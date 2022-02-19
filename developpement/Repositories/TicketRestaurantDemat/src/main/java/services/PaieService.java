package services;

import dto.PaieDto;

public interface PaieService {

     PaieDto getPaieDTO();
    void mettreAjourPaieDto(PaieDto paieDto) throws Exception;

}
