package sitko.patryk.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sitko.patryk.spring5webapp.domain.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
