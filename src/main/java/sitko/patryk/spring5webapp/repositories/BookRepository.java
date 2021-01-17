package sitko.patryk.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sitko.patryk.spring5webapp.domain.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
