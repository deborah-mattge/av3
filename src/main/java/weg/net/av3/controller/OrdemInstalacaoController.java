package weg.net.av3.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import weg.net.av3.model.OrdemInstalacao;
import weg.net.av3.model.Solicitante;
import weg.net.av3.service.OrdemInstalacaoService;
import weg.net.av3.service.SolicitanteService;

import java.util.Collection;
@RestController
@RequestMapping("/instalacao")
@AllArgsConstructor
public class OrdemInstalacaoController {
    private OrdemInstalacaoService ordemInstalacaoService;
    @GetMapping("/{id}")
    public OrdemInstalacao buscar(@PathVariable(value="id") Integer id){
        return ordemInstalacaoService.buscarUm(id);
    }
    @GetMapping()
    public Collection<OrdemInstalacao> buscarTodos(){
        return ordemInstalacaoService.buscarTodos();
    }
    @DeleteMapping
    public void deletar(@RequestParam Integer id){
        ordemInstalacaoService.deletar(id);
    }
    @PostMapping
    public void inserir(@RequestBody OrdemInstalacao ordemInstalacao){
        ordemInstalacaoService.salvar(ordemInstalacao);
    }
    @PutMapping
    public  void atualizar(@RequestBody OrdemInstalacao ordemInstalacao){
        ordemInstalacaoService.salvar(ordemInstalacao);
    }

}
