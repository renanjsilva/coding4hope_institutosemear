package model;

public class Task {
	private Integer idTask;
	private String status;
	private Mentor mentor; 
	private Student student;
	
	public Task() {
	}
	
	public Task (Integer idTask, String status) {
		this.idTask = idTask;
		this.status = status;
	}

	public Integer getIdTask() {
		return idTask;
	}

	public void setIdTask(Integer idTask) {
		this.idTask = idTask;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Mentor getMentor() {
		return mentor;
	}

	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
}
