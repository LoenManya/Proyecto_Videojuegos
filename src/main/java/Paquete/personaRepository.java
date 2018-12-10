package Paquete;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface personaRepository extends JpaRepository<Persona, Long> {
    //Page<Persona> findByPostId(Long postId, Pageable pageable);
}