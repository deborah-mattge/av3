package weg.net.av3.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import weg.net.av3.model.Administrador;
import weg.net.av3.repository.AdministradorRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class AdministradorService {
    private final AdministradorRepository usuarioRepository;

    public void salvar(Administrador administrador){
         usuarioRepository.save(administrador);
    }
    public Administrador buscarUm(Integer id){
        return usuarioRepository.findById(id).get();
    }
    public List<Administrador> buscarTodos(){
        return usuarioRepository.findAll();
    }
    public void deletar(Integer id){
        usuarioRepository.deleteById(id);
    }

}
