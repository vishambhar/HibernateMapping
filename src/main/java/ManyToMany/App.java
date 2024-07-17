package ManyToMany;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session =new Configuration().configure("ManyToMany/hibernate.cfg.xml").buildSessionFactory().openSession();
    	List<Teacher>list =List.of(new Teacher(402,"vijay","Vashi"),
    			new Teacher(102,"ram","math"),new Teacher(103,"radha","commacne"));
    	Student s1=new Student("karan","science",list);
    	Student s2=new Student("priya","math",list);
    	session.save(s1);
    	session.save(s2);
    	
    	session.beginTransaction().commit();
    	
    	session.close();
	}

}
