package com.CadastroCarros.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.CadastroCarros.entity.Cadastro;
public interface CadastroRepository extends JpaRepository<Cadastro,Long>{}