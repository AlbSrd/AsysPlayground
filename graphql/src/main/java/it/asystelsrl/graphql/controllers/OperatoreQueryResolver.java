package it.asystelsrl.graphql.controllers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import it.asystelsrl.graphql.entities.Operatore;
import it.asystelsrl.graphql.repos.OperatoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class OperatoreQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private OperatoreRepository repository;

    public Optional<Operatore> getOperatoreById(String id) {
        return repository.findById(Long.valueOf(id));
    }

    ;

}
