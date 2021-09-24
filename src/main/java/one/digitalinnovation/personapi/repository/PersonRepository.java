package one.digitalinnovation.personapi.repository;

import one.digitalinnovation.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

// Cria os métodos de manipulação do banco
public interface PersonRepository extends JpaRepository<Person, Long> {
}
