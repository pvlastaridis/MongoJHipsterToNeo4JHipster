package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.PersistentToken;
import com.mycompany.myapp.domain.User;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import java.util.List;

/**
 * Spring Data Neo4jDB repository for the PersistentToken entity.
 */
public interface PersistentTokenRepository extends GraphRepository<PersistentToken> {

    List<PersistentToken> findByUser(User user);

    @Query("MATCH (n:PersistentToken)-[]->(:User {login:{0}}) RETURN n")
    List<PersistentToken> findByUserCypher(String login);

    Iterable<PersistentToken> findByTokenDateBefore(Long localDate);

    PersistentToken findOneBySeries(String series);

}
