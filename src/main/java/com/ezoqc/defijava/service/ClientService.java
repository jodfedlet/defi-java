package com.ezoqc.defijava.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezoqc.defijava.exception.EntityNotFoundException;
import com.ezoqc.defijava.exception.InvalidArgumentException;
import com.ezoqc.defijava.model.Client;
import com.ezoqc.defijava.repository.ClientRepository;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client findById(Long id) throws Exception {
        if (id <= 0) {
            throw new InvalidArgumentException();
        }

        Optional<Client> clientFound = clientRepository.findById(id);
        if (!clientFound.isPresent()) {
            throw new EntityNotFoundException();
        }
        return clientFound.get();
    }
}
