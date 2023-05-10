package com.ezoqc.defijava.model;

import com.ezoqc.defijava.model.Client;
import java.util.Calendar;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ClientTests {
    @Test
	void testAge() {
		Client client = new Client();
		Calendar calendar = Calendar.getInstance();
		calendar.set(1988, 6, 15);
		client.setBirthdate(new Date(calendar.toInstant().toEpochMilli()));
		assertEquals(34, client.getAge());
	}
}