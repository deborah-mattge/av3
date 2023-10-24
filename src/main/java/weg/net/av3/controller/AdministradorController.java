package weg.net.av3.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import weg.net.av3.model.Administrador;
import weg.net.av3.service.AdministradorService;

import java.util.Collection;

@RestController
@RequestMapping("/administrador")
@AllArgsConstructor
public class AdministradorController {
    private AdministradorService administradorService;
    @GetMapping("/{id}")
    public Administrador buscar(@PathVariable(value="id") Integer id){
        return administradorService.buscarUm(id);
    }
    @GetMapping()
    public Collection<Administrador> buscarTodos(){
        return administradorService.buscarTodos();
    }
    @DeleteMapping
    public void deletar(@RequestParam  Integer id){
        administradorService.deletar(id);
    }
    @PostMapping
    public void inserir(@RequestBody Administrador administrador){
        administradorService.salvar(administrador);
    }
    @PutMapping
    public  void atualizar(@RequestBody Administrador administrador){
        administradorService.salvar(administrador);
    }


}
