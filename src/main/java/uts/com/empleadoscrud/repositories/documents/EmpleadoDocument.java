package uts.com.empleadoscrud.repositories.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "empleados")
public class EmpleadoDocument {
    @Id
    private String id;
    private String nombre;
    private String apellido;
    @Indexed(unique = true)
    private String correo;
    private String celular;
    private String direccion;
}
