package mx.edu.utez.mtsco.ExamenRecuMtsco.Model.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class ClienteDto {
    private Long id;
    private String nombre;
    private String primer_apellido;
    private String segundo_apellido;
    private int telefono;
    private String municipio;
    private String estado;
    private String sexo;
    private LocalDate cumpleaños;
}
