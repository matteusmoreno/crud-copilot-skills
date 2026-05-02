# Skill 3: Camada de API (Resource) e OpenAPI

1. Crie a classe `AlunoResource` no pacote `br.com.estacio.resource`.
2. Injete o `AlunoService`.
3. Caminho base: `/api/alunos`. Produz e Consome JSON.
4. Implemente os endpoints REST: GET (listar todos), GET por id, POST, PUT e DELETE.
5. Crie um diretório chamado `examples` na raiz do projeto (ou em `src/main/resources/examples`) e crie dois arquivos contendo exemplos reais de JSON:
    - `aluno-request.json`: contendo um exemplo de payload de envio (nome, idade, curso).
    - `aluno-response.json`: contendo um exemplo de payload de retorno (id, nome, idade, curso, status).
6. Atualize o arquivo `application.properties` para expor o Swagger na URL solicitada. Adicione a chave: `quarkus.swagger-ui.path=/swagger-ui`.
7. Para CADA endpoint, adicione documentação rica do Swagger:
    - Use `@Operation(summary = "...", description = "...")`.
    - Use `@APIResponse(responseCode = "200/201/204", description = "...", content = @Content(mediaType = "application/json", schema = @Schema(implementation = AlunoResponseDTO.class)))`.
    - Utilize a anotação de exemplos do OpenAPI para mapear o conteúdo dos arquivos criados para a documentação da interface.
8. Os métodos POST e PUT devem receber o `AlunoRequestDTO` validado com `@Valid`.