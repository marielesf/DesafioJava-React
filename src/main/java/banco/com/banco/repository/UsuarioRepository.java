package banco.com.banco.repository;

import banco.com.banco.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

    boolean deleteByCpf(String cpf);
    Usuario findByCpf(String cpf);

}

