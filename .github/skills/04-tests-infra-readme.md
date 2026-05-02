# Skill 4: Testes, Infraestrutura e README

1. Crie a classe `AlunoResourceTest` anotada com `@QuarkusTest`. Escreva 2 testes com `REST Assured`: um para garantir o HTTP 200 no GET `/api/alunos` e outro para validar que um POST sem o campo `nome` retorna HTTP 400.
2. Certifique-se de que o `application.properties` tem as chaves:
   `quarkus.mongodb.connection-string=mongodb://admin:adminpassword@localhost:27017/alunos_db?authSource=admin`
   `quarkus.swagger-ui.always-include=true`
3. Atualize o `README.md` com:
    - Descrição da Arquitetura em Camadas (Controller, Service, Repository, DTO).
    - Comando para subir o MongoDB com Docker (`docker-compose up -d`).
    - Comando para rodar a aplicação (`./mvnw compile quarkus:dev`).
    - Link para o Swagger (`http://localhost:8080/q/swagger-ui`).