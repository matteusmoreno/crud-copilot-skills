# Skill 3: Geração de Testes Unitários/Integração

Atue como um Engenheiro de QA Sênior especialista em Quarkus.

1. Crie a classe `AlunoResourceTest` no diretório de testes (`src/test/java/br/edu/estacio/`).
2. Utilize a anotação `@QuarkusTest`.
3. Escreva testes para os endpoints GET (listar todos) e POST (criar aluno).
4. Utilize a biblioteca `REST Assured` para realizar as chamadas HTTP.
5. Escreva um cenário de teste para validar se a criação de um aluno com dados inválidos (ex: idade 15) retorna o Status Code HTTP 400 (Bad Request).
6. Escreva um cenário de teste para validar se a criação com dados válidos retorna HTTP 201 (Created).