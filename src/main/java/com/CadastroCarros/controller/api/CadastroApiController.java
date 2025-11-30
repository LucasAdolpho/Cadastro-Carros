package com.CadastroCarros.controller.api;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.CadastroCarros.entity.Carro;
import com.CadastroCarros.service.CadastroService;
@RestController @RequestMapping("/api/cadastros")
public class CarroApiController{
 private final CarroService service;
 public CarroApiController(CarroService service){ this.service=service; }
 @GetMapping public List<Carro> listar(){ return service.listar(); }
 @PostMapping public Carro criar(@RequestBody Carro c){ return service.salvar(c); }
}
