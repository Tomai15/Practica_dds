package ar.edu.utn.frba.dds.ejercicio_02.personajes;

import ar.edu.utn.frba.dds.ejercicio_02.Persistente;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.ElementoDefensor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table
public class Personaje extends Persistente {

  @Getter
  @ManyToMany
  @JoinTable(
          name="personaje_elemento",
          joinColumns = @JoinColumn(name = "personaje_id"),
          inverseJoinColumns = @JoinColumn(name = "elemento_id")
  )
  private List<ElementoDefensor> elementos;

  @Getter @Setter
  @Column(name ="estamina")
  private Integer estamina;

  @Column(name ="puntosDeVida")
  @Getter @Setter
  private Integer puntosDeVida;

  public Personaje(){
    this.elementos = new ArrayList<>();
  }

  public void atacar(Personaje personaje) {
  //todo
  }

  public void agregarElemento(ElementoDefensor elemento){
    this.elementos.add(elemento);
  }

}
