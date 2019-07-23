package com.everis.service;

import java.util.Date;
import java.util.List;

import com.everis.model.MSStudents;

public interface MSStudentsService{
public List<MSStudents> finAll();
public MSStudents finById(Integer id, Date date);

}
