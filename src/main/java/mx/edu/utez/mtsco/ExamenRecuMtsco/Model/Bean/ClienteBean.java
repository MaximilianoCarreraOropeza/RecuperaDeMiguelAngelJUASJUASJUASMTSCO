package mx.edu.utez.mtsco.ExamenRecuMtsco.Model.Bean;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Setter
@Getter
@Table(name="clients")
public class ClienteBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 30, nullable = false)
    private String nombre;
    @Column(length = 30, nullable = false)
    private String primer_apellido;
    @Column(length = 30, nullable = false)
    private String segundo_apellido;
    @Column(length = 30, nullable = false)
    private int telefono;
    @Column(length = 30, nullable = false)
    private String municipio;
    @Column(length = 30, nullable = false)
    private String estado;
    @Column(length = 30, nullable = false)
    private String sexo;
    @Column(length = 30, nullable = false)
    private LocalDate cumpleaños;
}
