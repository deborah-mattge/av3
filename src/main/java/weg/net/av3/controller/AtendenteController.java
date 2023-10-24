package weg.net.av3.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import weg.net.av3.model.Atendente;
import weg.net.av3.model.Solicitante;
import weg.net.av3.service.AtendenteService;
import weg.net.av3.service.SolicitanteService;

import java.util.Collection;

@RestController
@RequestMapping("/atendente")
@AllArgsConstructor
public class AtendenteController {
    private AtendenteService atendenteService;
    @GetMapping("/{id}")
    public Atendente buscarUsuario(@PathVariable(value="id") Integer id){
        return atendenteService.buscarUm(id);
    }
    @GetMapping()
    public Collection<Atendente> buscarTodos(){
        return atendenteService.buscarTodos();
    }
    @DeleteMapping
    public void deletar(@RequestParam Integer id){
        atendenteService.deletar(id);
    }
    @PostMapping
    public void inserir(@RequestBody Atendente atendente){
        atendenteService.salvar(atendente);
    }
    @PutMapping
    public  void atualizar(@RequestBody Atendente atendente){
        atendenteService.salvar(atendente);
    }


}
