package br.com.estacio.dto;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema(name = "PersonResponse", description = "Resposta representando uma pessoa", example = "{\"id\": \"605c5f8a4f1a3b3c2d8f9e12\", \"name\": \"João Silva\", \"email\": \"joao@example.com\", \"age\": 30}")
public class PersonResponse {

    @Schema(example = "605c5f8a4f1a3b3c2d8f9e12")
    public String id;

    @Schema(example = "João Silva")
    public String name;

    @Schema(example = "joao@example.com")
    public String email;

    @Schema(example = "30")
    public Integer age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

