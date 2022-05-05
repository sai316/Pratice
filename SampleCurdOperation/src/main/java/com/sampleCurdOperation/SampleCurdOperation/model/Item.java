package com.sampleCurdOperation.SampleCurdOperation.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Item {
	
	@Id
	private String id;
	private String name;
	private int price;
	
}
