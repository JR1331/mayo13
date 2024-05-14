package com.softtek.mayo13.controlador;
import com.softtek.mayo13.modelo.Movil;
import com.softtek.mayo13.service.IMovilServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/moviles")
@CrossOrigin(origins = "http://localhost:4200")
public class ControladorMovil {

    @Autowired
    private IMovilServicio servicioM;

    @GetMapping
    public List<Movil> obtenerTodos() {
        return servicioM.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Movil obtenerUno(@PathVariable int id) {
        return servicioM.obtenerUno(id);
    }

    @PostMapping
    public Movil crearProducto(@RequestBody Movil m) {
        return servicioM.crear(m);
    }

    @DeleteMapping("/{id}")
    public void eliminarMovil(@PathVariable int id) {
        servicioM.eliminar(id);
    }

    @PutMapping
    public Movil modificarMovil(@RequestBody Movil m) {
        return servicioM.modificar(m);
    }
}
