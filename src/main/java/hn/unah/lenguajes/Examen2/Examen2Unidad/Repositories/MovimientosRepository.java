package hn.unah.lenguajes.Examen2.Examen2Unidad.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.Examen2.Examen2Unidad.Entities.Movimientos;

@Repository
public interface MovimientosRepository extends CrudRepository<Movimientos, Integer> {
    
}
