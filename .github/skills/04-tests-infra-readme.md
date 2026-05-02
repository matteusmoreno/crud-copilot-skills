# Skill 4: Infraestrutura (Docker) e Testes

1. **Docker Compose:** Crie o arquivo `docker-compose.yml` na raiz do projeto. Ele deve especificar a versão '3.8' e conter um serviço chamado `mongodb` usando a imagem `mongo:latest`. Exponha a porta `27017:27017` e configure as variáveis de ambiente `MONGO_INITDB_ROOT_USERNAME=admin` e `MONGO_INITDB_ROOT_PASSWORD=adminpassword`.
2. **Configuração de Properties:** No arquivo `src/main/resources/application.properties`, GARANTA que as seguintes chaves existam (sobrescreva se necessário):
   `quarkus.mongodb.connection-string=mongodb://admin:adminpassword@localhost:27017/?authSource=admin`
   `quarkus.mongodb.database=alunos_db`
   `quarkus.swagger-ui.always-include=true`
   `quarkus.swagger-ui.path=/swagger-ui`
3. **Testes:** Crie a classe `AlunoResourceTest` anotada com `@QuarkusTest`. Escreva 2 testes com `REST Assured`: um validando o HTTP 200 no GET `/api/alunos` e outro validando que um POST sem o campo `nome` retorna HTTP 400 (Bad Request).