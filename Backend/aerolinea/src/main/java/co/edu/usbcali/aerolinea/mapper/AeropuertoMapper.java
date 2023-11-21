package co.edu.usbcali.aerolinea.mapper;

import co.edu.usbcali.aerolinea.domain.Aeropuerto;
import co.edu.usbcali.aerolinea.dto.AeropuertoDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", uses = {CiudadMapper.class}, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface AeropuertoMapper extends EntityMapper<Aeropuerto, AeropuertoDto> {

    @Mapping(target = "ciudad", source = "ciudadId")
    Aeropuerto toEntity(AeropuertoDto dto);

    @Mapping(target = "ciudadId", source = "ciudad.id")
    @Mapping(target = "ciudadNombre", source = "ciudad.nombre")
    AeropuertoDto toDto(Aeropuerto entity);

    default Aeropuerto fromId(Integer id) {
        if (id == null) return null;
        return Aeropuerto.builder().id(id).build();
    }
}
