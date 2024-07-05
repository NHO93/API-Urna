package br.com.edenilson.urna.controller;

import br.com.edenilson.urna.model.Candidato;
import br.com.edenilson.urna.service.CandidatoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidatos")
@Tag(name = "Candidatos", description = "Endpoints para gerenciar candidatos")
public class CandidatoController {
    @Autowired
    private CandidatoService candidatoService;

    @GetMapping
    @Operation(summary = "Listar todos os candidatos", description = "Retorna uma lista de todos os candidatos")
    public List<Candidato> listarCandidatos() {
        return candidatoService.listarCandidatos();
    }

    @PostMapping
    @Operation(summary = "Adicionar um novo candidato", description = "Adiciona um novo candidato enviando um JSON com o nome do candidato")
    public Candidato adicionarCandidato(
            @RequestBody @Parameter(description = "Dados do novo candidato") Candidato candidato) {
        return candidatoService.salvarCandidato(candidato);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualizar um candidato", description = "Atualiza os dados de um candidato existente pelo ID")
    public Candidato atualizarCandidato(
            @PathVariable @Parameter(description = "ID do candidato a ser atualizado") Long id,
            @RequestBody @Parameter(description = "Novos dados do candidato") Candidato candidato) {
        return candidatoService.atualizarCandidato(id, candidato);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Deletar um candidato", description = "Deleta um candidato pelo ID")
    public void deletarCandidato(
            @PathVariable @Parameter(description = "ID do candidato a ser deletado") Long id) {
        candidatoService.deletarCandidato(id);
    }

    @PostMapping("/{id}/votar")
    @Operation(summary = "Registrar um voto", description = "Registra um voto para o candidato com o ID especificado")
    public void votar(
            @PathVariable @Parameter(description = "ID do candidato a receber o voto") Long id) {
        candidatoService.registrarVoto(id);
    }
}