package com.balba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balba.Dao.ShoeDao;
import com.balba.model.Shoe;

@Service
public class HelloService {
	
	@Autowired
	private ShoeDao shoeDao;
	
	public Shoe getShoe(Integer id){
		return shoeDao.findById(id);
	}
	
	public Shoe addShoe(Shoe shoe){
		return shoeDao.save(shoe);
	}
}
