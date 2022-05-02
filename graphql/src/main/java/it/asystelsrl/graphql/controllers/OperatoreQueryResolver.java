package it.asystelsrl.graphql.controllers;

import graphql.kickstart.tools.GraphQLQueryResolver;
import it.asystelsrl.graphql.entities.Operatore;
import it.asystelsrl.graphql.repos.OperatoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class OperatoreQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private OperatoreRepository repository;

    public Operatore getOperatoreById(Long id) {
        try {
            Optional<Operatore> operatore = repository.findById(id);
            if (operatore.isPresent()) {
                return operatore.get();
            }
        } catch (Exception e) {
            // TODO: non so gestire le eccezioni ahahahha
        }
        return null;
    }
}
