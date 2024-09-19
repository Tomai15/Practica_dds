package ar.edu.utn.frba.dds.ejercicio_02;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Persistente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
