package com.everis.serviceimplement;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.everis.model.MSStudents;
import com.everis.model.Students;
import com.everis.service.MSStudentsService;
@Service
public class MSStudentsServiceImplement implements MSStudentsService {

	@Autowired
	private RestTemplate studentRest;
	
	@Override
	public List<MSStudents> finAll() {
		List<Students> students = Arrays.asList(studentRest.getForObject("http://localhost:8010/Get", Students[].class));
		
		
		Date date = null;
		return students.stream().map(s -> new MSStudents(s,date)).collect(Collectors.toList());
	}

	@Override
	public MSStudents finById(Integer id, Date date) {
		Map<String,String> pathvariables = new HashMap<String,String>();
		pathvariables.put("id", id.toString());
		Students students = studentRest.getForObject("http://localhost:8010/Get/{id}",Students.class );
		return new MSStudents(students, date);
	}

}
