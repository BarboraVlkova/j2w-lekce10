package cz.czechitas.java2webapps.lekce10.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * odpovidajici field protistrany
 * vytvorene gettery a settery
 * nastavim anotaci @OneToOne -> entita Ucitel <- ma vazbu typu OneToOne na field trida
 */

@Entity
public class Ucitel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;


  private String jmeno;
  private String prijmeni;

  /**
   * Ucitel nemusi byt ve tride, udaj je volitelny
   * mappedBy <- ve tride trida je property je "tridniUcitel"
   * na jedne strane nakonfiguruju, na druhe strane rikam k cemu se vaze
   */
  @OneToOne(mappedBy = "tridniUcitel")
  private Trida trida;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getJmeno() {
    return jmeno;
  }

  public void setJmeno(String jmeno) {
    this.jmeno = jmeno;
  }

  public String getPrijmeni() {
    return prijmeni;
  }

  public void setPrijmeni(String prijmeni) {
    this.prijmeni = prijmeni;
  }

  public Trida getTrida() {
    return trida;
  }

  public void setTrida(Trida trida) {
    this.trida = trida;
  }

  @Override
  public String toString() {
    return String.format("%s %s [%d]", jmeno, prijmeni, id);
  }
}
