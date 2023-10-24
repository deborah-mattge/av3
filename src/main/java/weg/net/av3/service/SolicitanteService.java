package weg.net.av3.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import weg.net.av3.model.Solicitante;
import weg.net.av3.repository.SolicitanteRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class SolicitanteService {
    private final SolicitanteRepository usuarioRepository;
    public void salvar(Solicitante solicitante){
        usuarioRepository.save(solicitante);
    }
    public Solicitante buscarUm(Integer id){
        return usuarioRepository.findById(id).get();
    }
    public List<Solicitante> buscarTodos(){
        return usuarioRepository.findAll();
    }
    public void deletar(Integer id){
        usuarioRepository.deleteById(id);
    }


}
