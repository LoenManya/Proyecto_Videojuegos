package Paquete;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface videojuegoRepository extends JpaRepository<Videojuego, Long> {
    //Page<Persona> findByPostId(Long postId, Pageable pageable);
}