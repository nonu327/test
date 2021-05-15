/**
 * 
 */
package com.test.logisitic.repo;

import org.springframework.data.repository.CrudRepository;

import com.test.logisitic.entities.Test;

/**
 * @author Navdeep Mutreja
 *
 */
public interface TestRepo  extends CrudRepository<Test, Long>{

}
