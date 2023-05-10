package com.ezoqc.defijava.controller;

import com.ezoqc.defijava.exception.EntityNotFoundException;
import com.ezoqc.defijava.exception.InvalidArgumentException;
import com.ezoqc.defijava.model.Client;
import com.ezoqc.defijava.service.ClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("clients")
public class ClientController {
    @Autowired
    private ClientService clientService;

    Logger logger = LoggerFactory.getLogger(ClientController.class);

    @GetMapping("/{clientId}")
    public ResponseEntity<Client> getClientById(@PathVariable Long clientId) throws InvalidArgumentException, EntityNotFoundException {
        logger.info("[getClientById] - Starting to retrieve the client with id - {}", clientId);
        Client clientFound = clientService.findById(clientId);
        logger.info("[getClientById] - Client response: " + clientFound);
        return new ResponseEntity<>(clientFound, HttpStatus.OK);
    }
}
