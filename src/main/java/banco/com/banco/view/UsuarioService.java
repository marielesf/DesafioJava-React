package banco.com.banco.view;

import banco.com.banco.model.Usuario;
import banco.com.banco.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsuarioService {

    UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Iterable<Usuario> findAll(){
        return usuarioRepository.findAll();
    }

    public Usuario findByCpf(String cpf){
        return usuarioRepository.findByCpf(cpf);
    }

    public boolean deleteUsuario(String cpf){
        return usuarioRepository.deleteByCpf(cpf);
    }

    public Usuario criaUsuario(Usuario favorecido){
        return usuarioRepository.save(favorecido);
    }

    public Usuario updateUsuario(Usuario user){
        return usuarioRepository.save(user);
    }

}
