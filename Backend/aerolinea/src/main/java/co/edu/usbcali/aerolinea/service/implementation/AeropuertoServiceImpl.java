package co.edu.usbcali.aerolinea.service.implementation;


import co.edu.usbcali.aerolinea.domain.Aeropuerto;
import co.edu.usbcali.aerolinea.domain.Escala;
import co.edu.usbcali.aerolinea.dto.AeropuertoDto;
import co.edu.usbcali.aerolinea.mapper.AeropuertoMapper;
import co.edu.usbcali.aerolinea.repository.AeropuertoRepository;
import co.edu.usbcali.aerolinea.service.AeropuertoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class AeropuertoServiceImpl implements AeropuertoService {

    private final AeropuertoRepository repository;
    private final AeropuertoMapper mapper;


    @Override
    public AeropuertoDto save(AeropuertoDto request) {
        Aeropuerto entity = mapper.toEntity(request);
        entity = repository.save(entity);
        return mapper.toDto(entity);
    }

    @Override
    public AeropuertoDto update(AeropuertoDto request) {
        findById(request.getId());
        Aeropuerto entity = mapper.toEntity(request);
        entity.setId(request.getId());
        entity = repository.save(entity);
        return mapper.toDto(entity);
    }

    @Override
    public AeropuertoDto partialUpdate(AeropuertoDto request) {
        Aeropuerto entity = findById(request.getId());
        entity = mapper.partialUpdate(entity, request);
        repository.save(entity);
        return mapper.toDto(entity);
    }

    @Override
    public void delete(int id) {
        findById(id);
        repository.deleteById(id);
    }

    @Override
    public AeropuertoDto getById(Integer id) {
        return mapper.toDto(findById(id));
    }

    @Override
    public List<AeropuertoDto> getAll(Pageable pageable) {
        Page<Aeropuerto> pages = repository.findAll(pageable);
        return mapper.toDto(pages.getContent());
    }

    private Aeropuerto findById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException("No se encontro ningún aeropuerto"));
    }
}
