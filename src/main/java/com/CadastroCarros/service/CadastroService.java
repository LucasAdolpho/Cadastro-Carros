package com.CadastroCarros.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.CadastroCarros.repository.CadastroRepository;
import com.CadastroCarros.entity.Cadastro;
@Service
public class CadastroService {
 private final CadastroRepository repo;
 public CadastroService(CadastroRepository repo){ this.repo=repo; }
 public List<Cadastro> listar(){ return repo.findAll(); }
 public Cadastro salvar(Cadastro c){ return repo.save(c); }
}