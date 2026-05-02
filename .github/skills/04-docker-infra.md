# Skill 4: Configuração de Infraestrutura e Dockerização

Atue como um Engenheiro DevOps.

1. Valide ou crie o arquivo `docker-compose.yml` na raiz do projeto para garantir que o serviço do MongoDB esteja rodando corretamente na porta 27017, com variáveis de ambiente para root username e password.
2. Configure o arquivo `src/main/resources/application.properties` para:
    - Conectar ao MongoDB do docker-compose (`quarkus.mongodb.connection-string`).
    - Habilitar a interface do Swagger UI permanentemente (`quarkus.swagger-ui.always-include=true`).