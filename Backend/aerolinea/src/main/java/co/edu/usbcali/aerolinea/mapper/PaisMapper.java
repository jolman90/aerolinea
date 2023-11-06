package co.edu.usbcali.aerolinea.mapper;

import co.edu.usbcali.aerolinea.domain.Pais;
import co.edu.usbcali.aerolinea.dto.PaisDTO;

import java.util.ArrayList;
import java.util.List;

public class PaisMapper {

    public static PaisDTO domainToDto(Pais pais) {
        return PaisDTO.builder()
                .id(pais.getId())
                .codigo(pais.getCodigo())
                .nombre(pais.getNombre())
                .descripcion(pais.getDescripcion())
                .build();
    }

    public static Pais dtoToDomain(PaisDTO paisDTO) {
        return Pais.builder()
                .id(paisDTO.getId())
                .codigo(paisDTO.getCodigo())
                .nombre(paisDTO.getNombre())
                .descripcion(paisDTO.getDescripcion())
                .build();
    }

    public static List<PaisDTO> domainToDtoList (List<Pais> paises) {
        /*List<PaisDTO> paisesDto = new ArrayList<>();
        for (Pais pais: paises) {
            paisesDto.add(domainToDto(pais));
        }
        return paisesDto;*/
        return paises.stream().map(PaisMapper::domainToDto).toList();
    }

    public static List<Pais> dtoToDomainList(List<PaisDTO> paisesDto) {
        return paisesDto.stream().map(PaisMapper::dtoToDomain).toList();
    }

}
