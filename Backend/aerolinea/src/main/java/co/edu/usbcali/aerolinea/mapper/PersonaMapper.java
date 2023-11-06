package co.edu.usbcali.aerolinea.mapper;

import co.edu.usbcali.aerolinea.domain.Persona;
import co.edu.usbcali.aerolinea.dto.PersonaDTO;

import java.util.List;

public class PersonaMapper {

    public static Persona dtoToDomain(PersonaDTO personaDTO) {

        return Persona.builder()
                .id(personaDTO.getId())
                .tipodocumento(personaDTO.getTipodocumento())
                .numerodocumento(personaDTO.getNumerodocumento())
                .nombre(personaDTO.getNombre())
                .apellido(personaDTO.getApellido())
                .telefono(personaDTO.getTelefono())
                .correo(personaDTO.getCorreo())
                .build();

        /*Persona persona = new Persona();
        persona.setId(personaDTO.getId());
        persona.setTipodocumento(personaDTO.getTipodocumento());
        persona.setNumerodocumento(personaDTO.getNumerodocumento());
        persona.setNombre(personaDTO.getNombre());
        persona.setApellido(personaDTO.getApellido());
        persona.setTelefono(personaDTO.getTelefono());
        persona.setCorreo(personaDTO.getCorreo());*/

        //return persona;
    }

    public static PersonaDTO domainToDto(Persona persona) {
        return PersonaDTO.builder()
                .id(persona.getId())
                .tipodocumento(persona.getTipodocumento())
                .numerodocumento(persona.getNumerodocumento())
                .nombre(persona.getNombre())
                .apellido(persona.getApellido())
                .telefono(persona.getTelefono())
                .correo(persona.getCorreo())
                .build();
    }

    public static List<Persona> dtoToDomainList(List<PersonaDTO> personasDto) {
        return personasDto.stream().map(PersonaMapper::dtoToDomain).toList();
    }

    public static List<PersonaDTO> domainToDtoList(List<Persona> personas) {
        return personas.stream().map(PersonaMapper::domainToDto).toList();
    }



}
