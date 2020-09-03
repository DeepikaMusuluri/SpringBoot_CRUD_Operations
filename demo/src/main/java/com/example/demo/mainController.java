package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {
	@Autowired
	studentService studentservice;

	@GetMapping("student")
	public List<student> getStudent() {
		return studentservice.getStudentDetails();

	}

	@RequestMapping(value = "studentdetails/{id}", method = RequestMethod.GET)
	public student getStudentId(@PathVariable int id) {

		return studentservice.getStudentDetailsOnId(id);

	}

	@RequestMapping(value = "addstudent", method = RequestMethod.POST)
	public List<student> addStudentId(@RequestBody student Student) {

		return studentservice.addStudentDetailsOnId(Student);

	}

	@RequestMapping(value = "deletestudent/{id}", method = RequestMethod.DELETE)
	public List<student> deleteStudentId(@PathVariable int id) {

		return studentservice.deleteStudentDetailsOnId(id);

	}

	@RequestMapping(value = "updatestudent/{id}/{name}", method = RequestMethod.PUT)
	public List<student> updatestudent(@PathVariable int id, @PathVariable String name) {

		return studentservice.updatestudent(id, name);

	}
}
