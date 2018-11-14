package Paquete;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "persona", path = "crear_persona")

//This repository is an interface and will allow you to perform various operations
// involving Empresa objects.
// It gets these operations by extending the PagingAndSortingRepository
// interface defined in Spring Data Commons.
// https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/PagingAndSortingRepository.html

public interface PersonaRepository extends PagingAndSortingRepository<Persona, Long> {

    List<Persona> findByNombre(@Param("nombre") String nombre);

}
