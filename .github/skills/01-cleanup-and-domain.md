# Skill 1: Limpeza e Camada de Domínio/Dados

1. Exclua os arquivos de exemplo padrão do Quarkus, se existirem: `GreetingResource.java`, `GreetingResourceTest.java` e `GreetingResourceIT.java`. Devem ser excluidos os arquivos do projeto, nao apenas apgar seu conteudo. Os arquivos nao devem existir mais no projeto.
2. Crie a entidade `Aluno` no pacote `br.com.estacio.domain`.
    - Atributos: `id` (ObjectId), `nome` (String), `idade` (int), `curso` (String), `status` (String).
    - Gere os getters e setters.
3. Crie a interface `AlunoRepository` no pacote `br.com.estacio.repository` implementando `PanacheMongoRepository<Aluno>`.