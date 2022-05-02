package it.asystelsrl.graphql.repos;

import it.asystelsrl.graphql.entities.Operatore;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@SuppressWarnings("unused")
public interface OperatoreRepository extends CrudRepository<Operatore, Long> {
}
