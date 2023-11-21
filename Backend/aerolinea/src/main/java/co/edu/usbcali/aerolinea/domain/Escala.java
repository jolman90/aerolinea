package co.edu.usbcali.aerolinea.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "escalas")
public class Escala {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Instant fechaSalida;
    private Instant fechaLlegada;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idedestino", nullable = false)
    private Ciudad destino;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idaorien", nullable = false)
    private Ciudad origen;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idavions", nullable = false)
    private Avion avion;
}

