package weg.net.av3.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario {
    private String nome;
    private Long cpf;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

}
