package com.abc.sams.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.sams.api.dao.SubjectDao;
import com.abc.sams.api.entity.Subject;

@Service
public class SubjectService {
	@Autowired
	private SubjectDao dao;

	public Subject getSubjectById(long subjectId) {
		
		return dao.getSubjectById(subjectId);
	}

	public List<Subject> getAllSubjects() {
		
		return dao.getAllSubjects();
	}

	public Subject createSubject(Subject subject) {
		
		return dao.createSubject(subject);
	}

	public Subject updateSubject(Subject subjectDetails) {
		
		return dao.updateSubject(subjectDetails);
	}

	public String deleteSubject(long id) {
		
		return dao.deleteSubject(id);
	}
}
