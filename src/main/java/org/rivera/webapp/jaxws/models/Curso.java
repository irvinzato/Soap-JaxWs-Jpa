package org.rivera.webapp.jaxws.models;

import jakarta.persistence.*;

@Entity
@Table(name = "cursos")
public class Curso {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "nombre")
  private String name;

  @Column(name = "descripcion")
  private String description;

  //@XmlTransient Para cuando hay relaciones bi direccionales(Que no se haga cíclico)
  @Column(name = "instructor")
  private String teacher;

  @Column(name = "duracion")
  private Double duration;

  public Curso() {
  }

  public Curso(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getTeacher() {
    return teacher;
  }

  public void setTeacher(String teacher) {
    this.teacher = teacher;
  }

  public Double getDuration() {
    return duration;
  }

  public void setDuration(Double duration) {
    this.duration = duration;
  }
}
