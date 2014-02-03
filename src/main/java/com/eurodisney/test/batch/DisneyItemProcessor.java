package com.eurodisney.test.batch;

import org.springframework.batch.item.ItemProcessor;

import com.eurodisney.test.domain.Department;
import com.eurodisney.test.domain.Disney;

public class DisneyItemProcessor implements ItemProcessor<Object[], DepartmentDisney> {
	@Override
	public DepartmentDisney process(final Object[] rs) throws Exception {
		// Casting
		Department department = (Department)rs[0];
		Disney disney = (Disney)rs[1];
				
		// Transforming
		final DepartmentDisney transformedDepartmentDisney = new DepartmentDisney();
		
		// Business
		transformedDepartmentDisney.setIdDepartment(department.getId());
		transformedDepartmentDisney.setNameDepartment(department.getName());
		transformedDepartmentDisney.setNameDisneyEmployee(disney.getName().toUpperCase());
		transformedDepartmentDisney.setRealnameDisneyEmployee(disney.getRealname().toUpperCase());

		return transformedDepartmentDisney;
	}
}
