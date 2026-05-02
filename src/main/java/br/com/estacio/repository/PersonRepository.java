package br.com.estacio.repository;

import br.com.estacio.domain.Person;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.Optional;

@ApplicationScoped
public class PersonRepository implements PanacheMongoRepository<Person> {

    public Optional<Person> findByEmail(String email) {
        return find("email", email).firstResultOptional();
    }
}

