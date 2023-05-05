package com.ezoqc.defijava.controller;

import com.ezoqc.defijava.model.Client;
import com.ezoqc.defijava.service.ClientService;

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

    // private final Logger logger = Logger.getLogger(ClientController.class);

    @GetMapping("/{clientId}")
    public ResponseEntity<Client> getClientById(@PathVariable Long clientId) throws Exception {
        // logger.info("Starting to retrieve the client with id = " + clientId);
        Client clientFound = clientService.findById(clientId);
        // logger.info("Client response: " + clientFound);
        return new ResponseEntity(clientFound, HttpStatus.OK);
    }
}
