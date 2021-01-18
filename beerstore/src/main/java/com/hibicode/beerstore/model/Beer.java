package com.hibicode.beerstore.model;

import java.math.BigDecimal;

import javax.persistence.*;


import lombok.Data;

@Entity
@Data

public class Beer {
	
	@Id
	@SequenceGenator
	private Long id;
	private String name;
	private BeerType type;
	private BigDecimal volume;
	
	
	
     	
	
	

}
