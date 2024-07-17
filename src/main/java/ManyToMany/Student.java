package ManyToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int r_no;
	private String name;
	private String branch;
	
	@ManyToMany(cascade = CascadeType.ALL, targetEntity = Teacher.class)
	@JoinTable(name="Stud_teach",joinColumns= {@JoinColumn(name="s_no")},
					inverseJoinColumns= {@JoinColumn(name="t_id")})
	private List<Teacher>teacher;
	
	public Student(String name, String branch, List<Teacher> teacher) {
		super();
		
		this.name = name;
		this.branch = branch;
		this.teacher = teacher;
	}
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getR_no() {
		return r_no;
	}


	public void setR_no(int r_no) {
		this.r_no = r_no;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public List<Teacher> getTeacher() {
		return teacher;
	}


	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}


	@Override
	public String toString() {
		return "Student [r_no=" + r_no + ", name=" + name + ", branch=" + branch + ", teacher=" + teacher + "]";
	}


	
	
	
	
}
