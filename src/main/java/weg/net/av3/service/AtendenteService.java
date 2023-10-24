package weg.net.av3.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import weg.net.av3.model.Atendente;
import weg.net.av3.repository.AtendenteRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class AtendenteService {
    private  final AtendenteRepository usuarioRepository;
    public void salvar(Atendente atendente){
        usuarioRepository.save(atendente);
    }
    public Atendente buscarUm(Integer id){
        return usuarioRepository.findById(id).get();
    }
    public List<Atendente> buscarTodos(){
        return usuarioRepository.findAll();
    }
    public void deletar(Integer id){
        usuarioRepository.deleteById(id);
    }

}
