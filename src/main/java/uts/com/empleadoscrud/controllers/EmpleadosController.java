package uts.com.empleadoscrud.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import lombok.Data;
import uts.com.empleadoscrud.models.Empleado;
import uts.com.empleadoscrud.repositories.EmpleadoRepository;
import uts.com.empleadoscrud.repositories.documents.EmpleadoDocument;

@Data
@Controller
@AllArgsConstructor
@RequestMapping({ "app", "/app" })
public class EmpleadosController {

    private final EmpleadoRepository empleadoRepository ;

    @RequestMapping("/empleados")
    public String empleadosList(Model model) {
        List<EmpleadoDocument> empleados = obtenerEmpleados();
        model.addAttribute("empleados", empleados);
        return "empleados";
    }

    // private List<Empleado> obtenerEmpleados() {
    // List<Empleado> empleados = new ArrayList<>();
    // empleados.add(new Empleado("Juan", "Pérez", "juan@example.com", 40, "Contrato
    // A", 0));
    // empleados.add(new Empleado("María", "Gómez", "maria@example.com", 35,
    // "Contrato B", 0));
    // return empleados;
    // }

    private List<EmpleadoDocument> obtenerEmpleados() {
        List<EmpleadoDocument> empleados = empleadoRepository.findAll();
        return empleados;
    }


    // private void calcularSalario(List<Empleado> empleados) {
    // for (Empleado empleado : empleados) {
    // int horasTrabajadas = empleado.getHorasTrabajadas();
    // String tipoContrato = empleado.getTipoContrato();
    // double salarioBase = 0.0;

    // if ("Contrato A".equals(tipoContrato)) {
    // salarioBase = 10.0;
    // } else if ("Contrato B".equals(tipoContrato)) {
    // salarioBase = 12.0;
    // } else if ("Contrato C".equals(tipoContrato)) {
    // salarioBase = 15.0;
    // }

    // double horasExtras = horasTrabajadas > 40 ? horasTrabajadas - 40 : 0;
    // double totalAPagar = salarioBase * 40 + horasExtras * (salarioBase * 1.5);

    // empleado.setSalario(totalAPagar);
    // }
    // }
}
