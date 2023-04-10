package es.com.fk.web;

import es.com.fk.domain.Persona;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import es.com.fk.servicio.PersonaServicio;
import javax.validation.Valid;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ControladorInicio {
    
    @Autowired
    private PersonaServicio personaServicio;

   // @Value("${index.saludo}")

    @GetMapping("/")
    public String inicio(Model model) {
       

       var personas2 = personaServicio.listarPersonas();
       
       
        log.info("Ejecutando el controlador de spring mvc");
        model.addAttribute("personas2", personas2);

        return "index";
    }
    
     
    @GetMapping("/agregar")
    public String agregar(Persona persona){
        return "modificar";
    }
    
    @PostMapping("/guardar")
    public String guardar(@Valid Persona persona,Errors errors ){
        if(errors.hasErrors()){
            return "modificar";
        }
        personaServicio.guardar(persona);
        return "redirect:/";
    }
    
    @GetMapping("/editar/{id_Persona}")
    public String editar(Persona persona, Model model){
        persona = personaServicio.encontrarPersona(persona);
        model.addAttribute("persona", persona);
        return "modificar";
    }
    
    @GetMapping("/eliminar")
    public String eliminar(Persona persona){
        personaServicio.eliminar(persona);
        return "redirect:/";
    }

}
