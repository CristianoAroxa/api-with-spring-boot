package br.com.aroxa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aroxa.models.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
