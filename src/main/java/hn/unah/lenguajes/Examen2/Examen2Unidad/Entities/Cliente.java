package hn.unah.lenguajes.Examen2.Examen2Unidad.Entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import java.util.List;

@Entity
@Table(name="cliente")
@Data
public class Cliente {
    
    @Id
    private String dni;

    private String nombre;

    private String apellido;

    private String correo;

    private String telefono;

    @OneToOne
    @JoinColumn(name="dni", referencedColumnName = "dni")
    private Direccion direccion;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Cuentas> cuentas;
}
