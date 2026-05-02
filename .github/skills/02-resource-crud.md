# Skill 2: Geração de API REST (Resource)

Atue como um Engenheiro Java Sênior.
Crie o Controller para a entidade Aluno:

1. Crie a classe `AlunoResource` no pacote `br.edu.estacio.resource`.
2. Defina o caminho base como `/api/alunos`.
3. Implemente os métodos REST utilizando os verbos corretos:
    - GET: Listar todos os alunos.
    - GET: Buscar aluno por ID.
    - POST: Criar um aluno (Valide os dados da requisição com `@Valid`).
    - PUT: Atualizar os dados de um aluno existente.
    - DELETE: "Soft delete", alterando o atributo `status` do aluno para "Inativo" e salvando no banco.
4. Retorne os HTTP Status Codes adequados: 200 (OK), 201 (Created), 204 (No Content), 404 (Not Found).
5. Documente os endpoints usando as anotações do SmallRye OpenAPI (`@Operation`, `@APIResponse`, `@Tag`).