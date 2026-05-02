# Skill 3: Camada de API (Resource) e OpenAPI

1. Crie a classe `AlunoResource` no pacote `br.com.estacio.resource`.
2. Injete o `AlunoService`.
3. Caminho base: `/api/alunos`. Produz e Consome JSON.
4. Implemente os endpoints GET (lista), GET por id, POST, PUT e DELETE.
5. Para CADA endpoint, adicione documentação rica do Swagger:
    - `@Operation(summary = "...", description = "...")`
    - `@APIResponse(responseCode = "200/201/204", description = "...", content = @Content(mediaType = "application/json", schema = @Schema(implementation = AlunoResponseDTO.class)))`
6. O POST e o PUT devem receber o `AlunoRequestDTO` validado com `@Valid`.