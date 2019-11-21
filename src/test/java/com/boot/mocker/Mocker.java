package com.boot.mocker;

import static org.mockito.Mockito.*;

import java.util.List;

import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;

public class Mocker {

	public static void getTestMockObjects(Shipwreck shipwreck, ShipwreckRepository shipwreckRepository) {
		shipwreck.setId(1L);
		shipwreck.setName("TEST");
		shipwreck.setDepth(20);
	    when(shipwreckRepository.findOne(1L)).thenReturn(shipwreck);
	}

	public static void listTestMockObjects(List<Shipwreck> listShipwreck, ShipwreckRepository shipwreckRepository) {
		// TODO Auto-generated method stub
		listShipwreck.add(new Shipwreck(1L, "U869", "A very deep German UBoat", "FAIR", 200, 44.12, 138.44, 1994));
		//listShipwreck.add(new Shipwreck(2L, "Thistlegorm", "British merchant boat in the Red Sea", "GOOD", 80, 44.12, 138.44, 1994));
		//listShipwreck.add(new Shipwreck(3L, "S.S. Yongala", "A luxury passenger ship wrecked on the great barrier reef", "FAIR", 50, 44.12, 138.44, 1994));
	    when(shipwreckRepository.findAll()).thenReturn(listShipwreck);
	}

}
