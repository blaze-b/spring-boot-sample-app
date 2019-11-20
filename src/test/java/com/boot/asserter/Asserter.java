package com.boot.asserter;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;

import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;

public class Asserter {

	public static void getAssterForGetMethod(Shipwreck shipwreck, ShipwreckRepository shipwreckRepository) {
		// TODO Auto-generated method stub
		verify(shipwreckRepository).findOne(1L);
		//assertEquals(1L, shipwreck.getId().longValue());
		//assertEquals("TEST", shipwreck.getName());
		//assertEquals("20", shipwreck.getDepth().toString());
		//hamcrest setup
		assertThat(shipwreck.getId().longValue(), is(1L));
		assertThat(shipwreck.getName(), is("TEST"));
		assertThat(shipwreck.getDepth().toString(), is("20"));
	}


}
