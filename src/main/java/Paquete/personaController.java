package Paquete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController

public class personaController {
    @Autowired
    personaRepository personaRepository;

    @GetMapping("/users")
    public Page<Persona> getAllUsers(Pageable pageable) {
        return personaRepository.findAll(pageable);
    }

    @PostMapping("/users")
    public Persona createUsers(@Valid @RequestBody Persona user) {
        return personaRepository.save(user);
    }

    @PutMapping("/users/{userId}")
    public Persona updateUsers(@PathVariable Long userId, @Valid @RequestBody Persona userRequest) {
        return personaRepository.findById(userId).map(user -> {
            user.setDni(userRequest.getDni());
            user.setNombre(userRequest.getNombre());
            user.setApellido(userRequest.getApellido());
            return personaRepository.save(user);
        }).orElseThrow(() -> new ResourceNotFoundException("userId " + userId + " not found"));
    }

    @DeleteMapping("/users/{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable Long userId) {
        return personaRepository.findById(userId).map(user -> {
            personaRepository.delete(user);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException("UserId " + userId + " not found"));
    }

}
