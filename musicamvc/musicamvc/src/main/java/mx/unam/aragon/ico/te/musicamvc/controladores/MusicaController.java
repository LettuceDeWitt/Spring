package mx.unam.aragon.ico.te.musicamvc.controladores;

import mx.unam.aragon.ico.te.musicamvc.modelos.Artista;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tienda/")
public class MusicaController {
    @GetMapping("/home/")
    public String home() {
        return "home";
    }

    @GetMapping("/artista/")
    public String artista(Model model) {
        Artista artista = new Artista(1, "Freddie Mercury", "Rock", 25, "Algo",  "https://images-na.ssl-images-amazon.com/images/I/71M8yXz6o7L._AC_UL600_SR600,600_.jpg");
        model.addAttribute("artista", artista);
        return "artista";
    }
}
