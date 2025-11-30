package com.CadastroCarros.controller.api;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.CadastroCarros.entity.Cadastro;
import com.CadastroCarros.service.CadastroService;
@RestController @RequestMapping("/api/cadastros")
public class CadastroApiController{
 private final CadastroService service;
 public CadastroApiController(CadastroService service){ this.service=service; }
 @GetMapping public List<Cadastro> listar(){ return service.listar(); }
 @PostMapping public Cadastro criar(@RequestBody Cadastro c){ return service.salvar(c); }
}