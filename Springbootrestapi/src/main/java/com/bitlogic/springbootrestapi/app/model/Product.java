package com.bitlogic.springbootrestapi.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Product {
	@Id
	private int pid;
	private String pname;
	private double pprice;

}
