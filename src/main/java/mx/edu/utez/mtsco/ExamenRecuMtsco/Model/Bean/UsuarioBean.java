package mx.edu.utez.mtsco.ExamenRecuMtsco.Model.Bean;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Setter
@Getter
@Table(name="users")
public class UsuarioBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 30, nullable = false, unique = true)
    private String nombre_usuario;
    @Column(length = 8, nullable = false)
    private String contrasenia;
    @Column(columnDefinition = "BOOL DEFAULT true")
    private boolean estado;
}
