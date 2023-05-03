package com.ezoqc.defijava.controller;

import com.ezoqc.defijava.model.Client;
import com.ezoqc.defijava.repository.ClientDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client")
public class ClientController extends AbstractController {
    @Autowired
    private ClientDAO dao;

    @GetMapping
    public Client getClientById(@RequestParam Long clientId) {
        Client client_found = dao.findById(clientId).get();
        System.out.println(client_found);
        isFound(client_found);
        return client_found;
    }
}
