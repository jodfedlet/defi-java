package com.ezoqc.defijava.service;

import com.ezoqc.defijava.exception.EntityNotFoundException;
import com.ezoqc.defijava.exception.InvalidArgumentException;
import com.ezoqc.defijava.model.Client;
import com.ezoqc.defijava.repository.ClientRepository;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    Logger logger = LoggerFactory.getLogger(ClientService.class);

    public Client findById(Long id) throws InvalidArgumentException, EntityNotFoundException {
        logger.info("[findById] - Starting to retrieve the client with id - {}", id);

        if (id <= 0) {
            logger.error("[findById] - invalid received client id - {}", id);
            throw new InvalidArgumentException();
        }

        Optional<Client> clientFound = clientRepository.findById(id);
        if (!clientFound.isPresent()) {
            logger.error("[findById] - Client not found for this client id - {}", id);
            throw new EntityNotFoundException();
        }
        return clientFound.get();
    }
}
