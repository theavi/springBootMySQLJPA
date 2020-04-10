package com.avish.myhome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avish.myhome.dao.RentRepo;
import com.avish.myhome.model.Rent;

@RestController
public class RentResource {

	@Autowired
	private RentRepo rentRepo;

	@RequestMapping(value = "/")
	public List<Rent> findAllHome() {
		System.out.println("Size  :" + rentRepo.findAll().toString());
		return rentRepo.findAll();
	}

}
