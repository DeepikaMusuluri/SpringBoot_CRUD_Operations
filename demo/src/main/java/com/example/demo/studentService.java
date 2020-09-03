package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class studentService {

	List<student> studentList = new ArrayList<>();

	public List<student> getStudentDetails() {
		studentList.add(new student(1, "Deepika", "Vignans Lara"));
		studentList.add(new student(2, "Mounika", "KITS"));
		studentList.add(new student(3, "Fruity", "Vignan's Lara"));
		return studentList;

	}

	public student getStudentDetailsOnId(int id) {
		int index = 0;
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getId() == id) {
				index = i;
				break;
			}
		}
		return studentList.get(index);

	}

	public List<student> addStudentDetailsOnId(student student) {
		studentList.add(student);
		return studentList;
	}

	public List<student> deleteStudentDetailsOnId(int id) {

		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getId() == id) {
				studentList.remove(i);
				break;
			}
		}
		return studentList;
	}

	public List<student> updatestudent(int id, String name) {
		// TODO Auto-generated method stub
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getId() == id) {
				studentList.get(i).setName(name);
				break;
			}
		}
		return studentList;
	}

}
