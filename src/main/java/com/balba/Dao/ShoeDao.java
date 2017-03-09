package com.balba.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.balba.model.Shoe;

@Repository
public interface ShoeDao extends JpaRepository<Shoe, Integer>{
	
	Shoe findById(Integer id);
	
}
