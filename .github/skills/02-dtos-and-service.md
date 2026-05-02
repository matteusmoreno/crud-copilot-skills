# Skill 2: Camada de Transferência (DTO) e Regras de Negócio (Service)

1. Crie o pacote `br.com.estacio.dto`.
2. Crie o `AlunoRequestDTO`. Adicione validações: `nome` (@NotBlank), `idade` (@Min(16)), `curso` (@NotBlank).
    - Adicione anotações Swagger nos campos: `@Schema(example = "João Silva")`, `@Schema(example = "22")`, `@Schema(example = "Engenharia")`.
3. Crie o `AlunoResponseDTO` com os campos `id`, `nome`, `idade`, `curso`, `status`. Adicione `@Schema` com exemplos para o Swagger.
4. Crie a classe `AlunoService` no pacote `br.com.estacio.service` anotada com `@ApplicationScoped`.
5. Injete o `AlunoRepository` no Service e implemente os métodos de negócio:
    - `listarTodos()`: retorna `List<AlunoResponseDTO>`.
    - `buscarPorId(String id)`: retorna `AlunoResponseDTO` ou lança exceção se não achar.
    - `salvar(AlunoRequestDTO dto)`: converte DTO para Entidade (status padrão "Ativo"), persiste via repositório e retorna o `AlunoResponseDTO`.
    - `atualizar(String id, AlunoRequestDTO dto)`: busca, atualiza os dados, persiste e retorna DTO.
    - `inativar(String id)`: busca, muda o status para "Inativo" e persiste (Soft Delete).