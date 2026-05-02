package br.com.estacio.domain;

import io.quarkus.mongodb.panache.common.MongoEntity;
import org.bson.types.ObjectId;
import org.bson.codecs.pojo.annotations.BsonId;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

/**
 * Domain entity stored in MongoDB via Panache repository pattern.
 */
@MongoEntity(collection = "persons")
public class Person {

    @BsonId
    public ObjectId id;

    @NotBlank
    public String name;

    @NotBlank
    @Email
    public String email;

    @Min(0)
    public Integer age;

    public String getId() {
        return id == null ? null : id.toHexString();
    }

    public void setId(String id) {
        this.id = id == null ? null : new ObjectId(id);
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

