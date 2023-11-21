package co.edu.usbcali.aerolinea.mapper;

import co.edu.usbcali.aerolinea.domain.Avion;
import co.edu.usbcali.aerolinea.dto.AvionDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AvionMapper extends EntityMapper<Avion, AvionDTO> {

}
