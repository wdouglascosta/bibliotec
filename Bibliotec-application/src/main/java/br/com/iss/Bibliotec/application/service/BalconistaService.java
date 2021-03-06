package br.com.iss.Bibliotec.application.service;

import io.gumga.application.GumgaService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import org.hibernate.Hibernate;

import br.com.iss.Bibliotec.application.repository.BalconistaRepository;
import br.com.iss.Bibliotec.domain.model.Balconista;


@Service
@Transactional
public class BalconistaService extends GumgaService<Balconista, Long> {

    private final static Logger LOG = LoggerFactory.getLogger(BalconistaService.class);
    private final BalconistaRepository repository;

    @Autowired
    public BalconistaService(BalconistaRepository repository) {
        super(repository);
        this.repository = repository;
    }

}