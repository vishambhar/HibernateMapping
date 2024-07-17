package com.OneToMany;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Session session =new Configuration().configure("com/OneToMany/hibernate.cfg.xml").buildSessionFactory().openSession();
    	List<Address>list =List.of(new Address(402,"Hawre","Vashi"),
    			new Address(102,"Nerul","NaviMumbai"),new Address(103,"Sewood","MiniMahal"));
    		int i=(int)session.save(new Student("vish","Java_Developer",list));
    	session.beginTransaction().commit();
    	System.out.println("rows affected\s"+i);
    	session.close();
    }
}
