package br.com.estacio.service;

import br.com.estacio.domain.Person;
import br.com.estacio.dto.PersonRequest;
import br.com.estacio.dto.PersonResponse;
import br.com.estacio.mapper.PersonMapper;
import br.com.estacio.repository.PersonRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class PersonService {

    @Inject
    PersonRepository repository;

    public List<PersonResponse> listAll() {
        return repository.findAll().stream().map(PersonMapper::toResponse).collect(Collectors.toList());
    }

    public PersonResponse findById(String id) {
        Person p = repository.findByIdOptional(new org.bson.types.ObjectId(id)).orElseThrow(() -> new NotFoundException("Person not found"));
        return PersonMapper.toResponse(p);
    }

    @Transactional
    public PersonResponse create(PersonRequest req) {
        Person p = PersonMapper.toEntity(req);
        repository.persist(p);
        return PersonMapper.toResponse(p);
    }

    @Transactional
    public PersonResponse update(String id, PersonRequest req) {
        Person p = repository.findByIdOptional(new org.bson.types.ObjectId(id)).orElseThrow(() -> new NotFoundException("Person not found"));
        PersonMapper.updateEntity(p, req);
        repository.getClass(); // ensure repository is referenced in transactional context
        return PersonMapper.toResponse(p);
    }

    @Transactional
    public void delete(String id) {
        boolean deleted = repository.deleteById(new org.bson.types.ObjectId(id));
        if (!deleted) throw new NotFoundException("Person not found");
    }
}

