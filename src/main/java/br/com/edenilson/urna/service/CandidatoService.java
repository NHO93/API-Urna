package br.com.edenilson.urna.service;

import br.com.edenilson.urna.model.Candidato;
import br.com.edenilson.urna.repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatoService {
    @Autowired
    private CandidatoRepository candidatoRepository;

    public List<Candidato> listarCandidatos() {
        return candidatoRepository.findAll();
    }

    public Candidato salvarCandidato(Candidato candidato) {
        return candidatoRepository.save(candidato);
    }

    public Candidato atualizarCandidato(Long id, Candidato candidato) {
        Candidato candidatoExistente = candidatoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Candidato não encontrado"));
        candidatoExistente.setNome(candidato.getNome());
        candidatoExistente.setVotos(candidato.getVotos());
        return candidatoRepository.save(candidatoExistente);
    }

    public void deletarCandidato(Long id) {
        candidatoRepository.deleteById(id);
    }

    public void registrarVoto(Long id) {
        Candidato candidato = candidatoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Candidato não encontrado"));
        candidato.setVotos(candidato.getVotos() + 1);
        candidatoRepository.save(candidato);
    }
}