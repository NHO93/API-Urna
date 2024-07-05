# API Urna Eletrônica Digital

## Sobre o Projeto

A **Urna Eletrônica Digital** é uma aplicação construída usando Java e Spring Boot, que permite gerenciar candidatos e registrar votos. Este projeto demonstra a criação de endpoints RESTful e a documentação da API com Swagger.

## Funcionalidades

- **Listar Candidatos**: Recupera uma lista de todos os candidatos.
- **Adicionar Candidato**: Adiciona um novo candidato.
- **Atualizar Candidato**: Atualiza as informações de um candidato existente.
- **Deletar Candidato**: Remove um candidato pelo ID.
- **Registrar Voto**: Registra um voto para um candidato específico.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.3**
- **Spring Data JPA**
- **PostgreSQL**
- **Swagger**
- **Insônia**

## Endpoints

### Listar Todos os Candidatos

- **URL**: `/candidatos`
- **Método HTTP**: `GET`
- **Descrição**: Retorna uma lista de todos os candidatos.
- **Resposta**: 
  ```json
  [
    {
      "id": 1,
      "nome": "Candidato A",
      "votos": 10
    }
  ]
  ```

### Adicionar um Novo Candidato

- **URL**: `/candidatos`
- **Método HTTP**: `POST`
- **Descrição**: Adiciona um novo candidato.
- **Requisição**:
  ```json
  {
    "nome": "Candidato B"
  }
  ```
- **Resposta**:
  ```json
  {
    "id": 2,
    "nome": "Candidato B",
    "votos": 0
  }
  ```

### Atualizar um Candidato

- **URL**: `/candidatos/{id}`
- **Método HTTP**: `PUT`
- **Descrição**: Atualiza as informações de um candidato existente.
- **Requisição**:
  ```json
  {
    "nome": "Candidato B Atualizado",
    "votos": 5
  }
  ```
- **Resposta**:
  ```json
  {
    "id": 2,
    "nome": "Candidato B Atualizado",
    "votos": 5
  }
  ```

### Deletar um Candidato

- **URL**: `/candidatos/{id}`
- **Método HTTP**: `DELETE`
- **Descrição**: Remove um candidato pelo ID.

### Registrar um Voto

- **URL**: `/candidatos/{id}/votar`
- **Método HTTP**: `POST`
- **Descrição**: Registra um voto para o candidato especificado.

## Documentação da API

A documentação completa da API pode ser acessada via Swagger:

[Documentação Swagger](http://localhost:8080/swagger-ui/index.html)

## Como Executar o Projeto

### Pré-requisitos

- **Java 17**
- **Maven**
- **PostgreSQL**

### Configuração do Banco de Dados

Configure o banco de dados PostgreSQL com as seguintes propriedades no `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/urna
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

### Rodando a Aplicação

1. Clone o repositório:
   ```sh
   git clone https://github.com/NHO93/API-Urna.git
   ```

2. Navegue até o diretório do projeto:
   ```sh
   cd API-Urna
   ```

3. Compile e execute a aplicação:
   ```sh
   mvn spring-boot:run
   ```

4. Acesse a aplicação em:
   ```
   http://localhost:8080
   ```

## Contribuição

Sinta-se à vontade para contribuir com este projeto! Para isso, siga os passos abaixo:

1. Faça um fork do projeto.
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`).
3. Commit suas mudanças (`git commit -m 'Adiciona nova feature'`).
4. Envie para a branch (`git push origin feature/nova-feature`).
5. Abra um Pull Request.

## Licença

Este projeto está licenciado sob a Licença Apache 2.0. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

Feito por [Edenilson Fabiano](https://seusite.com).

---
