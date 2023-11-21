package co.edu.usbcali.aerolinea.mapper;

import co.edu.usbcali.aerolinea.domain.Ciudad;
import co.edu.usbcali.aerolinea.dto.CiudadDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CiudadMapper extends EntityMapper<Ciudad, CiudadDTO> {

    default Ciudad fromId(Integer id) {
        if (id == null) return null;
        return Ciudad.builder().id(id).build();
    }
}
