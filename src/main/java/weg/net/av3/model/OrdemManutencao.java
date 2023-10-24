package weg.net.av3.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrdemManutencao extends  OrdemDeServico{
    private String equipamento;
    private String dataManutencao;

}
