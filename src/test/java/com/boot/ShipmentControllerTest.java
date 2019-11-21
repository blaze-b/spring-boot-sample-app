package com.boot;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.boot.asserter.Asserter;
import com.boot.controller.ShipwreckController;
import com.boot.mocker.Mocker;
import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;

public class ShipmentControllerTest {

	Object[] expectedShipWrecks = new Object[3];

	@InjectMocks
	private ShipwreckController shipwreckController;// Controller initialization

	@Mock
	private ShipwreckRepository shipwreckRepository;// initialieses all of the mocked objects when the test runs

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Before
	public void initInputs() {
		expectedShipWrecks[0] = new Shipwreck(1L, "U869", "A very deep German UBoat", "FAIR", 200, 44.12, 138.44, 1994);
	}

	@Test
	public void testShipwreckGet() {
		// ShipwreckController shipwreckController = new ShipwreckController();
		Shipwreck shipwreck = new Shipwreck();
		Mocker.getTestMockObjects(shipwreck, shipwreckRepository);
		Shipwreck shpwreck = shipwreckController.get(1L);
		Asserter.getAssterForGetMethod(shpwreck, shipwreckRepository);
	}

	@Test
	public void testShipwreckList() {
		List<Shipwreck> listShipwreck = new ArrayList<Shipwreck>();
		Mocker.listTestMockObjects(listShipwreck, shipwreckRepository);
		List<Shipwreck> lstShipwreck = shipwreckController.list();
		for (Shipwreck shp : lstShipwreck) {
			assertEquals(1L, shp.getId().longValue());
			System.out.println("Success");
		}
		Object[] testOutput = lstShipwreck.toArray();
		System.out.println(testOutput.length);
		System.out.println(testOutput[0]);
		System.out.println(expectedShipWrecks[0]);
		//assertArrayEquals(expectedShipWrecks, testOutput);
	}
}
