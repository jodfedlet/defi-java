package com.ezoqc.defijava;

import com.ezoqc.defijava.controller.ClientController;
import com.ezoqc.defijava.repository.ClientRepository;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@SpringBootTest
class DefijavaApplicationTests {
	@InjectMocks
	private ClientController ctrl;

	@Mock
	private ClientRepository dao;

	/*
	@Test
	void testThatControllerReturnsValue() {
		when(dao.findById(1L)).thenReturn(Optional.of(new Client()));
      Client cli = ctrl.getClientById(1L);
		assertNotNull(cli);
	}

	@Test
	void testAge() {
		Client c = new Client();
		Calendar car = Calendar.getInstance();
		car.set(1988, 6, 15);
		c.setBirthdate(new Date(car.toInstant().toEpochMilli()));
		assertEquals(34, Math.floor(c.getAge()));
	}

	*/

}
