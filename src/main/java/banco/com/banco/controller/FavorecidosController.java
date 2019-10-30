package banco.com.banco.controller;

import banco.com.banco.model.Usuario;
import banco.com.banco.view.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/favorecidos")
public class FavorecidosController {

    @Autowired //injecao de dependencia - usar 1 classe sem instancia = new
    UsuarioService usuarioService;

    @GetMapping("/all/")
    public ResponseEntity <Iterable<Usuario>> listFavorecidos(){
        return ResponseEntity.ok(usuarioService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity getFavorecido(@PathVariable String id){
        return ResponseEntity.ok(usuarioService.findByCpf(id));
    }

    @DeleteMapping("/{id}")
    public void deleteFavorecido(@PathVariable String id){
        System.out.println(usuarioService.deleteUsuario(id));
    }

    @PostMapping("/insert/")
    public ResponseEntity insertFavorecido(@RequestBody Usuario favorecido){
        return ResponseEntity.ok(usuarioService.criaUsuario(favorecido));
    }

    @PatchMapping("/")
    public Usuario updateFavorecido(Usuario user){
        return usuarioService.updateUsuario(user);
    }
}
