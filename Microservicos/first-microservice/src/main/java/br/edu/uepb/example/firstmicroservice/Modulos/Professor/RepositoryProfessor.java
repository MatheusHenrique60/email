package br.edu.uepb.example.firstmicroservice.Modulos.Professor;

import br.edu.uepb.example.firstmicroservice.Modulos.Professor.ModelProfessor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryProfessor extends JpaRepository<ModelProfessor, Long> {}
