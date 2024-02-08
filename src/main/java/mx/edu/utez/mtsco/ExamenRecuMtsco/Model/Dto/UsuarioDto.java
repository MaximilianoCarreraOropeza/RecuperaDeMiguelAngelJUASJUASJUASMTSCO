package mx.edu.utez.mtsco.ExamenRecuMtsco.Model.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UsuarioDto {
    private Long id;
    private String nombre_usuario;
    private String contraseña;
    private boolean estado;
}
