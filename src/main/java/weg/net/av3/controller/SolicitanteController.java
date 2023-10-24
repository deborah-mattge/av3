package weg.net.av3.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import weg.net.av3.model.Solicitante;
import weg.net.av3.service.SolicitanteService;

import java.util.Collection;
@RestController
@RequestMapping("/solicitante")
@AllArgsConstructor
public class SolicitanteController {
    private SolicitanteService solicitanteService;
    @GetMapping("/{id}")
    public Solicitante buscar(@PathVariable(value="id") Integer id){
        return solicitanteService.buscarUm(id);
    }
    @GetMapping()
    public Collection<Solicitante> buscarTodos(){
        return solicitanteService.buscarTodos();
    }
    @DeleteMapping
    public void deletar(@RequestParam Integer id){
        solicitanteService.deletar(id);
    }
    @PostMapping
    public void inserir(@RequestBody Solicitante solicitante){
        solicitanteService.salvar(solicitante);
    }
    @PutMapping
    public  void atualizar(@RequestBody Solicitante solicitante){
        solicitanteService.salvar(solicitante);
    }

}
