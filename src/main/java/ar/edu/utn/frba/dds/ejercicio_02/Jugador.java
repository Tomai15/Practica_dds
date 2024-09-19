package ar.edu.utn.frba.dds.ejercicio_02;

import ar.edu.utn.frba.dds.ejercicio_02.personajes.Personaje;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Getter
@Setter
public class Jugador extends Persistente {

  @Column(name ="nombre")
  private String nombre;

  @Column(name ="apellido")
  private String apellido;

  //hacer converter date

  private LocalDate fechaAlta;

  @ManyToOne
  @JoinColumn(name = "personaje_id")
  private Personaje personaje;


  public Jugador() {
    this.fechaAlta = LocalDate.now();
  }

  public void cambiarPersonaje(Personaje personaje) {
    this.personaje = personaje;
  }
}
