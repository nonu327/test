/**
 * 
 */
package com.test.logisitic.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Navdeep Mutreja
 *
 */
@Entity(name = "test")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Test  {
	
	@Id
	private Long id;
	
	
	private Long count;
	
}
