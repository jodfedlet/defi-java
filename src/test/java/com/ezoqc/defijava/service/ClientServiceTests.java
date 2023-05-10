package com.ezoqc.defijava.service;

import com.ezoqc.defijava.exception.EntityNotFoundException;
import com.ezoqc.defijava.exception.InvalidArgumentException;
import com.ezoqc.defijava.model.Client;
import com.ezoqc.defijava.repository.ClientRepository;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class ClientServiceTests {

    @InjectMocks
	private ClientService clientService;

    @Mock
	private ClientRepository clientRepository;

    @Test
	void testGetClientByIdSuccessfully() {
        try {
            Long clientId = 1L;
            Client clientInstance = new Client();
            clientInstance.setId(clientId);

            when(clientRepository.findById(clientId))
            .thenReturn(Optional.of(clientInstance));

            Client client = clientService.findById(clientId);
            assertNotNull(client);
            assertEquals(clientId, client.getId());
        } catch (Exception e) {}
	}

    @Test
	void testGetClientByIdWithInvalidArgumentException() {
        Long clientId = 0L;
        assertThrows(InvalidArgumentException.class, () ->clientService.findById(clientId) );
	}

    @Test
	void testGetClientByIdWithEntityNotFoundException() {
        Long clientId = 10L;
        assertThrows(EntityNotFoundException.class, () ->clientService.findById(clientId) );
	}
}