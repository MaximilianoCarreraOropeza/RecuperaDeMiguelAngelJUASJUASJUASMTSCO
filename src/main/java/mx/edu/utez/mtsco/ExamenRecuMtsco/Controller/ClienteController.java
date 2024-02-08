package mx.edu.utez.mtsco.ExamenRecuMtsco.Controller;


import mx.edu.utez.mtsco.ExamenRecuMtsco.Service.Impl.ClienteImpl;
import mx.edu.utez.mtsco.ExamenRecuMtsco.Model.Bean.ClienteBean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clients/")
@CrossOrigin(origins = {"*"})
public class ClienteController {

    private final ClienteImpl service;

    public ClienteController(ClienteImpl service) {
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
    public ResponseEntity register(@RequestBody ClienteBean person) {
        return ResponseEntity.ok(service.save(person));
    }

    @PutMapping("")
    public ResponseEntity update(@RequestBody ClienteBean person) {
        return ResponseEntity.ok(service.save(person));
    }

    @DeleteMapping("{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.ok("Borrado Cliente");
    }
}
