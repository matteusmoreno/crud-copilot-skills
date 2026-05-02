# Skill 2: Camada de Transferência (DTO) e Regras de Negócio (Service)

1. Crie o pacote `br.com.estacio.dto`.
2. Crie o `AlunoRequestDTO`. Adicione validações: `nome` (@NotBlank), `idade` (@Min(16)), `curso` (@NotBlank). Adicione anotações Swagger nos campos: `@Schema(example = "...")`.
3. Crie o `AlunoResponseDTO` com os campos `id`, `nome`, `idade`, `curso`, `status`. Adicione `@Schema` com exemplos.
4. Crie a classe `AlunoService` no pacote `br.com.estacio.service` anotada com `@ApplicationScoped`.
5. Injete o `AlunoRepository` no Service e implemente os métodos de negócio: `listarTodos()`, `buscarPorId(String id)`, `salvar(AlunoRequestDTO dto)`, `atualizar(String id, AlunoRequestDTO dto)` e `inativar(String id)`.
6. **IMPORTANTE (Programação Defensiva):** Em todos os métodos que recebem o `String id`, ao instanciar `new org.bson.types.ObjectId(id)`, envolva em um `try-catch`. Se estourar `IllegalArgumentException` (caso o ID não seja um hexadecimal de 24 caracteres válido), lance uma `NotFoundException("Formato de ID inválido")`.