package com.avish.myhome.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.avish.myhome.model.Rent;

public interface RentRepo extends JpaRepository<Rent, Integer> {

	@Query("FROM Rent")
	List<Rent> findAll();
}
