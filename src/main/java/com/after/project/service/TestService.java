package com.after.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.after.project.DTO.TestDTO;
import com.after.project.repository.TestRepository;

@Service
public class TestService {
	@Autowired TestRepository tr;

	public int test(TestDTO test) {
		
		return tr.test(test);
	}
	
}
