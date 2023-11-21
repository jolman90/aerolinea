package co.edu.usbcali.aerolinea.service.implementation;

import co.edu.usbcali.aerolinea.domain.Avion;
import co.edu.usbcali.aerolinea.dto.AvionDTO;
import co.edu.usbcali.aerolinea.mapper.AvionMapper;
import co.edu.usbcali.aerolinea.repository.AvionRepository;
import co.edu.usbcali.aerolinea.service.AvionService;
import org.springframework.stereotype.Service;

@Service
public class AvionServiceImpl implements AvionService {

    private final AvionRepository avionRepository;
    private final AvionMapper mapper;

    public AvionServiceImpl(AvionRepository avionRepository, AvionMapper mapper) {
        this.avionRepository = avionRepository;
        this.mapper = mapper;
    }

    @Override
    public AvionDTO guardarNuevoAvion(AvionDTO avionDTO) throws Exception {
        if (avionDTO == null) {
            throw new Exception("No han llegado los datos del avión");
        }

        if(avionDTO.getNombre() == null || avionDTO.getNombre().isBlank()) {
            throw new Exception("No ha llegado el nombre del avión");
        }

        if(avionDTO.getReferencia() == null || avionDTO.getReferencia().isBlank()) {
            throw new Exception("Debe ingresar la referencia del avión");
        }

        if(avionDTO.getTipo() == null || avionDTO.getTipo().isBlank()) {
            throw new Exception("No hay información relacionada con el tipo de avión");
        }

        if(avionDTO.getCapacidad() == null || avionDTO.getCapacidad().equals(0)) {
            throw new Exception("La capacidad del avión es incorrecta, debe ser mayor a cero");
        }

        Avion avion = mapper.toEntity(avionDTO);
        return mapper.toDto(avionRepository.save(avion));
    }

    @Override
    public AvionDTO modificarAvion(AvionDTO avionDTO) throws Exception {
        return null;
    }
}
