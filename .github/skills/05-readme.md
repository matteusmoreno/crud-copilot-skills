# Skill 5: Documentação Rica (README.md)

Atue como um Tech Lead e crie um arquivo `README.md` na raiz do projeto com um visual profissional. Ele DEVE conter as seguintes seções:
1. **Badges:** Adicione badges visuais (pode usar shields.io) indicando as tecnologias: Java, Quarkus, MongoDB, Docker.
2. **Sobre o Projeto:** Uma descrição clara do que o sistema faz e a arquitetura adotada (Resource, Service, Repository, DTO).
3. **Pré-requisitos:** O que precisa estar instalado (Java 17, Maven, Docker).
4. **Como Executar:** Um passo a passo (Step by Step) ensinando a:
    - Subir a infraestrutura com `docker-compose up -d`.
    - Iniciar o modo desenvolvedor com `./mvnw compile quarkus:dev`.
5. **Acesso ao Swagger:** Destaque o link `http://localhost:8080/swagger-ui` para visualização e testes da API.
6. **Endpoints da API:** Uma tabela em Markdown listando os endpoints, métodos (GET, POST, PUT, DELETE) e suas respectivas descrições.
7. **Exemplos de cURL:** Pelo menos dois blocos de código com chamadas via cURL (um para POST e outro para GET).