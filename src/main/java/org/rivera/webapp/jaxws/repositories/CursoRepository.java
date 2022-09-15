package org.rivera.webapp.jaxws.repositories;

import org.rivera.webapp.jaxws.models.Curso;

import java.util.List;

public interface CursoRepository {
  List<Curso> toList();
  Curso save(Curso course);
}
