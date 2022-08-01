package br.edu.uepb.example.firstmicroservice.Modulos.Aluno;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.uepb.example.firstmicroservice.Modulos.Aluno.ModelAluno;

@Repository
public interface RepositoryAluno extends JpaRepository<ModelAluno, Long> {}
