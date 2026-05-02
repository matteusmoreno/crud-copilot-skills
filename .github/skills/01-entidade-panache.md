# Skill 1: Geração de Entidade com Panache e Bean Validation

Atue como um Engenheiro Java Sênior.
Crie a entidade principal do projeto seguindo estas regras:

1. Crie a classe `Aluno` no pacote `br.edu.estacio.domain`.
2. Estenda a classe `PanacheMongoEntity` (Padrão Active Record).
3. Use a anotação `@MongoEntity(collection="alunos")`.
4. Atributos e Validações (Hibernate Validator):
    - `nome` (String): Obrigatório (`@NotBlank`), tamanho mínimo de 3 caracteres.
    - `idade` (int): Obrigatório (`@NotNull`), valor mínimo de 16 (`@Min(16)`).
    - `curso` (String): Obrigatório (`@NotBlank`).
    - `status` (String): Padrão "Ativo".
5. Não crie getters e setters. Mantenha os atributos públicos conforme o padrão do Panache.