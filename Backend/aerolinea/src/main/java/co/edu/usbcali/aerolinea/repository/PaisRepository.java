package co.edu.usbcali.aerolinea.repository;

import co.edu.usbcali.aerolinea.domain.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Integer> {
    Pais findPaisByCodigo(String codigo);
}
