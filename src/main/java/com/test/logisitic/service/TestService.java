/**
 * 
 */
package com.test.logisitic.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.test.logisitic.entities.Test;
import com.test.logisitic.repo.TestRepo;

import lombok.RequiredArgsConstructor;

/**
 * @author Navdeep Mutreja
 *
 */
@Service
@RequiredArgsConstructor
public class TestService {

	private final TestRepo testRepo;

	public synchronized void updateCount() {
		Optional<Test> test = testRepo.findById(1L);
		Test t1= null;
		if (test.isPresent()) {
			t1 =  Test.builder().id(test.get().getId()).count(test.get().getCount()+1).build();
		}else {
			t1 = Test.builder().id(1L).count(1L).build();
		}
		testRepo.save(t1);
	};
}
