package com.sampleCurdOperation.SampleCurdOperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sampleCurdOperation.SampleCurdOperation.Repo.ItemRepo;
import com.sampleCurdOperation.SampleCurdOperation.model.Item;

@RestController
public class ItemController {
	@Autowired
	ItemRepo repo;
	
	@PostMapping("/")
	public Item saveItem(@RequestBody Item item) {
		
		return repo.save(item);
	}
	@GetMapping("/getAll")
	public List<Item> getAll(){
		return repo.findAll();
		
	}

}
