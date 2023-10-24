package weg.net.av3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import weg.net.av3.model.Solicitante;

import java.beans.JavaBean;

public interface SolicitanteRepository extends JpaRepository<Solicitante, Integer> {
}
