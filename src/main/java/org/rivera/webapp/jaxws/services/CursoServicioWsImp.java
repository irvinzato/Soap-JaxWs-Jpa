package org.rivera.webapp.jaxws.services;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import org.rivera.webapp.jaxws.models.Curso;
import org.rivera.webapp.jaxws.repositories.CursoRepository;

import java.util.List;

@Stateless  //Para poder inyectar el repositorio tiene que ser un componente CDI o JB
@WebService(endpointInterface = "org.rivera.webapp.jaxws.services.CursoServicioWs")  //Indico que métodos se van a implementar en el servicio web, si quiere que sean todos quito "endpointInterface"
public class CursoServicioWsImp implements CursoServicioWs {

  @Inject
  private CursoRepository repository;

  @Override
  @WebMethod  //Para que se puedan publicar
  public String greet(String person) {
    System.out.println("Imprimiendo dentro del servicio web con instancia: " + this);
    return "Hola que tal " + person;
  }

  @Override
  @WebMethod
  public List<Curso> listCourses() {
    return repository.toList();
  }

  @Override
  @WebMethod
  public Curso saveCourse(Curso course) {
    System.out.println("Curso guardado con éxito: " + course.getName());
    return repository.save(course);
  }

}
