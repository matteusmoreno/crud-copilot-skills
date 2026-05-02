package br.com.estacio.mapper;

import br.com.estacio.domain.Person;
import br.com.estacio.dto.PersonRequest;
import br.com.estacio.dto.PersonResponse;

public class PersonMapper {

    public static Person toEntity(PersonRequest req) {
        if (req == null) return null;
        Person p = new Person();
        p.setName(req.getName());
        p.setEmail(req.getEmail());
        p.setAge(req.getAge());
        return p;
    }

    public static PersonResponse toResponse(Person p) {
        if (p == null) return null;
        PersonResponse r = new PersonResponse();
        r.setId(p.getId());
        r.setName(p.getName());
        r.setEmail(p.getEmail());
        r.setAge(p.getAge());
        return r;
    }

    public static void updateEntity(Person target, PersonRequest req) {
        if (target == null || req == null) return;
        target.setName(req.getName());
        target.setEmail(req.getEmail());
        target.setAge(req.getAge());
    }
}

