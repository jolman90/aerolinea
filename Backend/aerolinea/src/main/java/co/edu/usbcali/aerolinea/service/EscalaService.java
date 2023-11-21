package co.edu.usbcali.aerolinea.service;

import co.edu.usbcali.aerolinea.dto.AeropuertoDto;
import co.edu.usbcali.aerolinea.dto.EscalaDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EscalaService {
    EscalaDto save(EscalaDto request);
    EscalaDto update(EscalaDto request);
    EscalaDto partialUpdate(EscalaDto request);
    void delete(int id);
    EscalaDto getById(Integer id);

    List<EscalaDto> getAll(Pageable pageable);
}
