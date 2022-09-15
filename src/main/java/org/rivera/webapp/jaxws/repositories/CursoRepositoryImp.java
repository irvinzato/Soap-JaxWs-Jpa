package org.rivera.webapp.jaxws.repositories;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.rivera.webapp.jaxws.models.Curso;

import java.util.List;

@RequestScoped
public class CursoRepositoryImp implements CursoRepository{

  @Inject
  private EntityManager em;

  @Override
  public List<Curso> toList() {
    return em.createQuery("FROM Curso", Curso.class)
            .getResultList();
  }

  @Override
  public Curso save(Curso course) {
    if( course.getId() != null && course.getId() > 0 ) {
      em.merge(course);
    } else {
      em.persist(course);
    }
    return course;
  }
}
