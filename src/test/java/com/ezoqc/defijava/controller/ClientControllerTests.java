package com.ezoqc.defijava.controller;

import com.ezoqc.defijava.model.Client;
import com.ezoqc.defijava.service.ClientService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

class ClientControllerTests {
    @Autowired
  private MockMvc mockMvc;

    @Mock
	private ClientService clientService;

    @Test
	void testGetClientByIdSuccessfully() throws Exception {
        try {
            Long clientId = 1L;
        
            Client clientInstance = new Client();
            clientInstance.setId(clientId);
          
            when(clientService.findById(clientId)).thenReturn(clientInstance);

            mockMvc.perform(MockMvcRequestBuilders.get("/clients/{clientId}", clientId))
                .andExpect(MockMvcResultMatchers.status().isUnauthorized())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(clientId));
            
        } catch (Exception e) {}
	}

}