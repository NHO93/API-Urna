package br.com.edenilson.urna.repository;


import br.com.edenilson.urna.model.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatoRepository extends JpaRepository
        <Candidato, Long> {
}