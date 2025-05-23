package br.com.aroxa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.aroxa.models.Person;
import br.com.aroxa.repositories.PersonRepository;

@Service
public class PersonServices {

    @Autowired
    PersonRepository repository;

    public List<Person> findAll(){
        
        return repository.findAll();
    }

}
