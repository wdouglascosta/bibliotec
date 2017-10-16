package br.com.iss.Bibliotec.application.service;

import io.gumga.application.GumgaService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import org.hibernate.Hibernate;

import br.com.iss.Bibliotec.application.repository.ReservaRepository;
import br.com.iss.Bibliotec.domain.model.Reserva;


@Service
@Transactional
public class ReservaService extends GumgaService<Reserva, Long> {

    private final static Logger LOG = LoggerFactory.getLogger(ReservaService.class);
    private final ReservaRepository repository;

    @Autowired
    public ReservaService(ReservaRepository repository) {
        super(repository);
        this.repository = repository;
    }

}