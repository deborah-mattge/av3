package weg.net.av3.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import weg.net.av3.model.OrdemManutencao;
import weg.net.av3.repository.OrdemManutencaoRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class OrdemManutencaoService {
    private final OrdemManutencaoRepository ordemRepository;
    public void salvar(OrdemManutencao ordemManutencao){
        ordemRepository.save(ordemManutencao);
    }
    public OrdemManutencao buscarUm(Integer id){
        return ordemRepository.findById(id).get();
    }
    public List<OrdemManutencao> buscarTodos(){
        return ordemRepository.findAll();
    }
    public void deletar(Integer id){
        ordemRepository.deleteById(id);
    }
}
