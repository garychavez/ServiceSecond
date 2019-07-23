package com.everis.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.everis.model.MSStudents;
import com.everis.service.MSStudentsService;

@RestController
public class MSStudentsController {

	@Autowired
	private MSStudentsService msStudentsService;
	
	@GetMapping("/get")
	public List<MSStudents> listar(){
		return msStudentsService.finAll();
	}
	
	@GetMapping("get/{id}/date/{date}")
	public MSStudents detalle(@PathVariable Integer id,@PathVariable Date date) {
		return msStudentsService.finById(id, date);
		
	}
}
