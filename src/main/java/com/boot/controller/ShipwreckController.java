package com.boot.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;

@RestController
//base endpoint URL
@RequestMapping("api/v1/")
public class ShipwreckController {

	@Autowired
	ShipwreckRepository shipwreckRepository;

	// GET /api/v1/shipwrecks(list)
	@RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
	public List<Shipwreck> list() {
		// return ShipwreckStub.list();
		return shipwreckRepository.findAll();
	}

	// POST /api/v1/shipwrecks (add)
	@RequestMapping(value = "shipwrecks", method = RequestMethod.POST)
	public Shipwreck create(@RequestBody Shipwreck shipwreck) {
		// return ShipwreckStub.create(shipwreck);
		return shipwreckRepository.saveAndFlush(shipwreck);
	}

	// GET /api/v1/shipwrecks/{id} (view)
	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.GET)
	public Shipwreck get(@PathVariable long id) {
		// return ShipwreckStub.get(id);
		return shipwreckRepository.findOne(id);

	}

	// PUT /api/v1/shipwrecks/{id}(update)
	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.PUT)
	public Shipwreck update(@PathVariable long id, @RequestBody Shipwreck shipwreck) {
		// return ShipwreckStub.update(id,shipwreck);
		Shipwreck existingShipwreck = shipwreckRepository.findOne(id);
		BeanUtils.copyProperties(shipwreck, existingShipwreck);
		return shipwreckRepository.saveAndFlush(existingShipwreck);
	}

	// DELETE /api/v1/shipwrecks/{id}(delete)
	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.DELETE)
	public Shipwreck delete(@PathVariable long id) {
		// return ShipwreckStub.delete(id);
		Shipwreck existingShipwreck = shipwreckRepository.findOne(id);
		shipwreckRepository.delete(existingShipwreck);
		return existingShipwreck;
	}
}
