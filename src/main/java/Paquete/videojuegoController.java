
package Paquete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController

public class videojuegoController {
    @Autowired
    videojuegoRepository videojuegoRepository;

    @GetMapping("/games")
    public Page<Videojuego> getAllGames(Pageable pageable) {
        return videojuegoRepository.findAll(pageable);
    }

    @PostMapping("/games")
    public Videojuego createGames(@Valid @RequestBody Videojuego game) {
        return videojuegoRepository.save(game);
    }

    @PutMapping("/games/{gameId}")
    public Videojuego updateGames(@PathVariable Long gameId, @Valid @RequestBody Videojuego gameRequest) {
        return videojuegoRepository.findById(gameId).map(game -> {
            game.setIdentificador(gameRequest.getIdentificador());
            game.setNombre(gameRequest.getNombre());
            game.setCompania(gameRequest.getCompania());
            return videojuegoRepository.save(game);
        }).orElseThrow(() -> new ResourceNotFoundException("gameId " + gameId + " not found"));
    }

    @DeleteMapping("/games/{gameId}")
    public ResponseEntity<?> deleteGame(@PathVariable Long gameId) {
        return videojuegoRepository.findById(gameId).map(game -> {
            videojuegoRepository.delete(game);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException("GameId " + gameId + " not found"));
    }

}
