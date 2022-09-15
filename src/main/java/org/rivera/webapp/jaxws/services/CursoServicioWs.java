package org.rivera.webapp.jaxws.services;

import jakarta.jws.WebService;
import org.rivera.webapp.jaxws.models.Curso;

import java.util.List;

@WebService //Todos los métodos estarán en el servicio web
public interface CursoServicioWs {
  String greet(String person);
  List<Curso> listCourses();
  Curso saveCourse(Curso course);
}
