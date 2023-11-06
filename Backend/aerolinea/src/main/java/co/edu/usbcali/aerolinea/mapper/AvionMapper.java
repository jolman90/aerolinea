package co.edu.usbcali.aerolinea.mapper;

import co.edu.usbcali.aerolinea.domain.Avion;
import co.edu.usbcali.aerolinea.dto.AvionDTO;

import java.util.List;

public class AvionMapper {

    public static AvionDTO domainToDto(Avion avion) {
        return AvionDTO.builder()
                .id(avion.getId())
                .nombre(avion.getNombre())
                .descripcion(avion.getDescripcion())
                .referencia(avion.getReferencia())
                .tipo(avion.getTipo())
                .capacidad(avion.getCapacidad())
                .build();
    }

    public static Avion dtoToDomain(AvionDTO avionDTO) {
        return Avion.builder()
                .id(avionDTO.getId())
                .nombre(avionDTO.getNombre())
                .descripcion(avionDTO.getDescripcion())
                .referencia(avionDTO.getReferencia())
                .tipo(avionDTO.getTipo())
                .capacidad(avionDTO.getCapacidad())
                .build();
    }

    public static List<AvionDTO> domainToDtoList(List<Avion> aviones) {
        return aviones.stream().map(AvionMapper::domainToDto).toList();
    }

    public static List<Avion> dtoToDomainList(List<AvionDTO> avionesDto) {
        return avionesDto.stream().map(AvionMapper::dtoToDomain).toList();
    }

}
