package hn.unah.lenguajes.Examen2.Examen2Unidad.Entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="cuentas")
@Data
public class Cuentas {
    
    @Id
    @Column(name="numerocuenta")
    private String numeroCuenta;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="dni", referencedColumnName = "dni")
    private Cliente cliente;

    private double saldo;

    @Column(name="fechaapertura")
    private LocalDate fechaApertura = LocalDate.now();
    
    private boolean estado;

    private boolean sobregiro;

    @OneToMany(mappedBy = "cuentas", cascade = CascadeType.ALL)
    private List<Movimientos> movimientos;
}
