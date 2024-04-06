package hn.unah.lenguajes.Examen2.Examen2Unidad.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.Examen2.Examen2Unidad.Entities.Direccion;

@Repository
public interface DireccionRepository extends CrudRepository<Direccion, Integer>{

    
}
