package mx.edu.utez.mtsco.ExamenRecuMtsco.Controller;

import mx.edu.utez.mtsco.ExamenRecuMtsco.Model.Bean.UsuarioBean;
import mx.edu.utez.mtsco.ExamenRecuMtsco.Service.Impl.UsuarioImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users/")
@CrossOrigin(origins = {"*"})
public class UsuarioController {

    private final UsuarioImpl service;

    public UsuarioController(UsuarioImpl service) {
        this.service = service;
    }

    @GetMapping("")
    public ResponseEntity getAll() {
        return ResponseEntity.ok(service.readAll());
    }

    @GetMapping("{id}")
    public ResponseEntity getById(@PathVariable Long id){
        return ResponseEntity.ok(service.getById(id));
    }

    @PostMapping("")
    public ResponseEntity register(@RequestBody UsuarioBean person) {
        return ResponseEntity.ok(service.save(person));
    }

    @PutMapping("")
    public ResponseEntity update(@RequestBody UsuarioBean person) {
        return ResponseEntity.ok(service.save(person));
    }

    @DeleteMapping("{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.ok("Borrado Usuario");
    }
}
