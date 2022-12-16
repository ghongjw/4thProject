package com.after.project.repository;

import org.springframework.stereotype.Repository;

import com.after.project.DTO.TestDTO;
@Repository
public interface TestRepository {
	public int test(TestDTO test);
}
