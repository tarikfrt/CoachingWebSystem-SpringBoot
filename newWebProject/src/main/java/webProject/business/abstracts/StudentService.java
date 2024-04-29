package webProject.business.abstracts;

import java.util.List;

import webProject.core.utilities.results.DataResult;
import webProject.core.utilities.results.Result;
import webProject.entities.concretes.Student;
import webProject.entities.concretes.StudentDataOfPlan;
import webProject.entities.concretes.StudentMessage;

public interface StudentService {
	
	List<Student> getAll();
	List<StudentMessage> getAllStudentMessage();
	Result addStudentMessage(StudentMessage studentMessage);
	
	List<StudentDataOfPlan> getAllStudentDataOfPlan();
	Result addStudentDataOfPlan(StudentDataOfPlan studentDataOfPlan);
	
	Result add(Student student);
	
	
	DataResult<Student> getByStudentName(String studentName);
	DataResult<Student> getByStudentId(int studentId);
	void update(Student student);
	void delete(int studentId);

}
