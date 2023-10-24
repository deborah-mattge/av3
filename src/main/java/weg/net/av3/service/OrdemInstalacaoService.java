package weg.net.av3.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import weg.net.av3.model.OrdemInstalacao;
import weg.net.av3.repository.OrdemInstalacaoRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class OrdemInstalacaoService {
    private final OrdemInstalacaoRepository ordemRepository;
    public void salvar(OrdemInstalacao ordemInstalacao){
        ordemRepository.save(ordemInstalacao);
    }
    public OrdemInstalacao buscarUm(Integer id){
        return ordemRepository.findById(id).get();
    }
    public List<OrdemInstalacao> buscarTodos(){
        return ordemRepository.findAll();
    }
    public void deletar(Integer id){
        ordemRepository.deleteById(id);
    }
}
