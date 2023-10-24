package weg.net.av3.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import weg.net.av3.model.OrdemManutencao;
import weg.net.av3.model.Solicitante;
import weg.net.av3.service.OrdemManutencaoService;
import weg.net.av3.service.SolicitanteService;

import java.util.Collection;
@RestController
@RequestMapping("/manutencao")
@AllArgsConstructor
public class OrdemManutencaoController {
    private OrdemManutencaoService ordemManutencaoService;
    @GetMapping("/{id}")
    public OrdemManutencao buscar(@PathVariable(value="id") Integer id){
        return ordemManutencaoService.buscarUm(id);
    }
    @GetMapping()
    public Collection<OrdemManutencao> buscarTodos(){
        return ordemManutencaoService.buscarTodos();
    }
    @DeleteMapping
    public void deletar(@RequestParam Integer id){
        ordemManutencaoService.deletar(id);
    }
    @PostMapping
    public void inserir(@RequestBody OrdemManutencao ordemManutencao){
        ordemManutencaoService.salvar(ordemManutencao);
    }
    @PutMapping
    public  void atualizar(@RequestBody OrdemManutencao ordemManutencao){
        ordemManutencaoService.salvar(ordemManutencao);
    }
}
