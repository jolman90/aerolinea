package co.edu.usbcali.aerolinea.mapper;

import co.edu.usbcali.aerolinea.domain.Escala;
import co.edu.usbcali.aerolinea.dto.EscalaDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {CiudadMapper.class, AvionMapper.class})
public interface EscalaMapper extends EntityMapper<Escala, EscalaDto>{
}
