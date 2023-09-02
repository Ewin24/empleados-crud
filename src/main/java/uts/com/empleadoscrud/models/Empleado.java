package uts.com.empleadoscrud.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Empleado {
    private String nombre;
    private String apellido;
    private String tipoContrato;

}
