package br.com.estacio.dto;

import org.eclipse.microprofile.openapi.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Schema(name = "PersonRequest", description = "Payload para criação/atualização de pessoa", example = "{\"name\": \"João Silva\", \"email\": \"joao@example.com\", \"age\": 30}")
public class PersonRequest {

    @NotBlank
    @Schema(example = "João Silva")
    public String name;

    @NotBlank
    @Email
    @Schema(example = "joao@example.com")
    public String email;

    @Min(0)
    @Schema(example = "30")
    public Integer age;

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

