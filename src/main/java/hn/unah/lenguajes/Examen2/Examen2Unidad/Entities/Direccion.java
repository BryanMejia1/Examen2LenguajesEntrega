package hn.unah.lenguajes.Examen2.Examen2Unidad.Entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="direccion")
@Data
public class Direccion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="iddireccion")
    private int idDireccion;

    @OneToOne(mappedBy = "direccion")
    private Cliente cliente;

    private String estado;

    private String ciudad;

    private String calle;

}
