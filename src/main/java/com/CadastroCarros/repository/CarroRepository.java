package com.CadastroCarros.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.CadastroCarros.entity.Carro;
public interface CarroRepository extends JpaRepository<Carro,Long>{}
