package Paquete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.validation.Valid;


@RestController

public class  inscripcionController {

    @Autowired
    personaRepository personaRepository;
    @Autowired
    videojuegoRepository videojuegoRepository;
    @Autowired
    inscripcionRepository inscripcionRepository;

    @GetMapping("/inscripciones")
    public Page<Inscripcion> getAllInscripciones(Pageable pageable) {
        return inscripcionRepository.findAll(pageable);
    }
    /*
    @PostMapping("/inscripciones")
    public Inscripcion createInscripcion(@Valid @RequestBody Inscripcion inscripcion) {
        return inscripcionRepository.save(inscripcion);
    }*/

    @PostMapping("/inscripciones/{videojuegoId}/{personaId}")
    public Inscripcion createInscripcion(@PathVariable (value = "personaId") Long personaId, @PathVariable (value= "videojuegoId") Long videojuegoId,
                                 @Valid @RequestBody Inscripcion inscripcion) {


        return videojuegoRepository.findById(videojuegoId).map(videojuego -> {
            inscripcion.setVideojuego(videojuego);
            return personaRepository.findById(personaId).map(persona -> {
            inscripcion.setPersona(persona);
            return inscripcionRepository.save(inscripcion);
            }).orElseThrow(() -> new ResourceNotFoundException("Id Persona " + personaId + " not found"));
        }).orElseThrow(() -> new ResourceNotFoundException("Id Videojuego " + videojuegoId + " not found"));
    }


/*  Deshabilitamos la modificación porque hemos determinado que las inscripciones se crean o se borran no se modifican
    @PutMapping("/inscripciones/{inscripcionId}")
    public Inscripcion updateInscripcion(@PathVariable Long inscripcionId, @Valid @RequestBody Inscripcion inscripcionRequest) {
        return inscripcionRepository.findById(inscripcionId).map(inscripcion -> {
            //inscripcion.setId_persona(inscripcionRequest.getId_persona());
            //inscripcion.setId_videojuegos(inscripcionRequest.getId_videojuegos());
            inscripcion.setFecha_inscripcion(inscripcionRequest.getFecha_inscripcion());
            return inscripcionRepository.save(inscripcion);
        }).orElseThrow(() -> new ResourceNotFoundException("inscripcionId " + inscripcionId + " not found"));
    }
*/
    @DeleteMapping("/inscripciones/{inscripcionId}")
    public ResponseEntity<?> deleteInscripcion(@PathVariable Long inscripcionId) {
        return inscripcionRepository.findById(inscripcionId).map(inscripcion -> {
            inscripcionRepository.delete(inscripcion);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException("InscripcionId " + inscripcionId + " not found"));
    }



}
