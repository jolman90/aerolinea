package co.edu.usbcali.aerolinea.service;

import co.edu.usbcali.aerolinea.dto.AeropuertoDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AeropuertoService {

    AeropuertoDto save(AeropuertoDto request);
    AeropuertoDto update(AeropuertoDto request);
    AeropuertoDto partialUpdate(AeropuertoDto request);
    void delete(int id);
    AeropuertoDto getById(Integer id);
    List<AeropuertoDto> getAll(Pageable pageable);
}
