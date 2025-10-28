package br.edu.fatecpg.jpaspring.Repository;

import br.edu.fatecpg.jpaspring.Model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
