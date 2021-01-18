package be.intecbrussel.patryksitko.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import be.intecbrussel.patryksitko.spring5webapp.domain.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {

}
