package banco.com.banco.repository;

import banco.com.banco.model.ContaDigital;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaDigitalRepository extends CrudRepository<ContaDigital, Integer> {
}
