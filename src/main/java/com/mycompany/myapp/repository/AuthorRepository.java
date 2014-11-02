package com.mycompany.myapp.repository;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.mycompany.myapp.domain.Author;

/**
 * Spring Data MongoDB repository for the Author entity.
 */
public interface AuthorRepository extends GraphRepository<Author> {

}
