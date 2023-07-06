package guru.springframework.spring6webapp.repositories;

import guru.springframework.spring6webapp.domain.Authior;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Authior, Long> {
}
