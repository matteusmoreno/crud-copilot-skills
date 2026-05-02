# Skill 4: Testes e Infraestrutura (Docker e Properties)

1. **Configuração de Properties:** No arquivo `src/main/resources/application.properties`, GARANTA que as seguintes chaves existam:
   `quarkus.mongodb.connection-string=mongodb://admin:adminpassword@localhost:27017/?authSource=admin`
   `quarkus.mongodb.database=alunos_db`
   `quarkus.swagger-ui.always-include=true`
   `quarkus.swagger-ui.path=/swagger-ui`
2. **Configuração Docker:** Valide ou crie o `docker-compose.yml` para rodar o MongoDB na porta 27017 com as credenciais `admin` e `adminpassword`.
3. **Testes:** Crie a classe `AlunoResourceTest` anotada com `@QuarkusTest`. Escreva 2 testes com `REST Assured`: um validando o HTTP 200 no GET `/api/alunos` e outro validando que um POST sem o campo `nome` retorna HTTP 400.